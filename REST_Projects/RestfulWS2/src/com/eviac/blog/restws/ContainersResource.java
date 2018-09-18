package com.eviac.blog.restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Path("/containers")
@Produces("application/xml")
public class ContainersResource {
    @Context UriInfo uriInfo;
    @Context Request request;
    
    @Path("{container}")
    public ContainerResource getContainerResource(@PathParam("container")
        String container) {
        return new ContainerResource(uriInfo, request, container);
    }
    
    @GET
    public Containers getContainers() {
        System.out.println("GET CONTAINERS");
        
        return MemoryStore.MS.getContainers();
    }    
}		
