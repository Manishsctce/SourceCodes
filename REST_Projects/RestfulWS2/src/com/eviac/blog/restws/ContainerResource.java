package com.eviac.blog.restws;

import javax.ws.rs.PathParam;

@Produces("application/xml")
public class ContainerResource {
    @Context UriInfo uriInfo;
    @Context Request request;
    String container;
    
    ContainerResource(UriInfo uriInfo, Request request, String container) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.container = container;
    }
    
    @GET
    public Container getContainer(@QueryParam("search") String search) {
        System.out.println("GET CONTAINER " + container + ", search = " + search);

        Container c = MemoryStore.MS.getContainer(container);
        if (c == null)
            throw new NotFoundException("Container not found");
        
        
        if (search != null) {
            c = c.clone();
            Iterator<Item> i = c.getItem().iterator();
            byte[] searchBytes = search.getBytes();
            while (i.hasNext()) {
                if (!match(searchBytes, container, i.next().getName()))
                    i.remove();
            }
        }
        
        return c;
    }    

    @PUT
    public Response putContainer() {
        System.out.println("PUT CONTAINER " + container);
        
        URI uri =  uriInfo.getAbsolutePath();
        Container c = new Container(container, uri.toString());
        
        Response r;
        if (!MemoryStore.MS.hasContainer(c)) {
            r = Response.created(uri).build();
        } else {
            r = Response.noContent().build();
        }
        
        MemoryStore.MS.createContainer(c);
        return r;
    }
    
    @DELETE
    public void deleteContainer() {
        System.out.println("DELETE CONTAINER " + container);
        
        Container c = MemoryStore.MS.deleteContainer(container);
        if (c == null)
            throw new NotFoundException("Container not found");
    } 
    
    
    @Path("{item: .+}")
    public ItemResource getItemResource(@PathParam("item") String item) {
        return new ItemResource(uriInfo, request, container, item);
    }
    
    private boolean match(byte[] search, String container, String item) {
        byte[] b = MemoryStore.MS.getItemData(container, item);
        
        OUTER: for (int i = 0; i < b.length - search.length; i++) {
             for (int j = 0; j < search.length; j++) {
                if (b[i + j] != search[j])
                    continue OUTER;
            }
            
            return true;
        }
        
        return false;
    }
}
