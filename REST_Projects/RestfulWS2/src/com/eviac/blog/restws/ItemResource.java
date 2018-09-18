package com.eviac.blog.restws;

import java.math.BigInteger;
import java.net.URI;
import java.security.MessageDigest;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.Response;

import org.apache.catalina.Container;

import com.sun.jersey.api.NotFoundException;

public class ItemResource {
    UriInfo uriInfo;
    Request request;
    String container;
    String item;
    
    public ItemResource(UriInfo uriInfo, Request request,
            String container, String item) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.container = container;
        this.item = item;
    }
    
    @GET
    public Response getItem() {
        System.out.println("GET ITEM " + container + " " + item);
        
        Item i = MemoryStore.MS.getItem(container, item);
        if (i == null)
            throw new NotFoundException("Item not found");
        Date lastModified = i.getLastModified().getTime();
        EntityTag et = new EntityTag(i.getDigest());
        ResponseBuilder rb = request.evaluatePreconditions(lastModified, et);
        if (rb != null)
            return rb.build();
            
        byte[] b = MemoryStore.MS.getItemData(container, item);
        return Response.ok(b, i.getMimeType()).
                lastModified(lastModified).tag(et).build();
    }    
    
    @PUT
    public Response putItem(
            @Context HttpHeaders headers,
            byte[] data) {
        System.out.println("PUT ITEM " + container + " " + item);
        
        URI uri = uriInfo.getAbsolutePath();
        MediaType mimeType = headers.getMediaType();
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(GregorianCalendar.MILLISECOND, 0);
        Item i = new Item(item, uri.toString(), mimeType.toString(), gc);
        String digest = computeDigest(data);
        i.setDigest(digest);
        
        Response r;
        if (!MemoryStore.MS.hasItem(container, item)) {
            r = Response.created(uri).build();
        } else {
            r = Response.noContent().build();
        }
        
        Item ii = MemoryStore.MS.createOrUpdateItem(container, i, data);
        if (ii == null) {
            // Create the container if one has not been created
            URI containerUri = uriInfo.getAbsolutePathBuilder().path("..").
                    build().normalize();
            Container c = new Container(container, containerUri.toString());
            MemoryStore.MS.createContainer(c);
            i = MemoryStore.MS.createOrUpdateItem(container, i, data);
            if (i == null)
                throw new NotFoundException("Container not found");
        }
        
        return r;
    }    
    
    @DELETE
    public void deleteItem() {
        System.out.println("DELETE ITEM " + container + " " + item);
        
        Item i = MemoryStore.MS.deleteItem(container, item);
        if (i == null) {
            throw new NotFoundException("Item not found");
        }
    }
    
    
    private String computeDigest(byte[] content) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            byte[] digest = md.digest(content);
            BigInteger bi = new BigInteger(digest);
            return bi.toString(16);
        } catch (Exception e) {
            return "";
        }
    }
}