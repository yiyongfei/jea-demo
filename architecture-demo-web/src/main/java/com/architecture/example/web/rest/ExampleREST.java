package com.architecture.example.web.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.architecture.example.dto.ExampleUsersDTO;

public interface ExampleREST {

	@POST
    @Produces(MediaType.TEXT_PLAIN)
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/save")
	public String save(ExampleUsersDTO exampleDto);
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/update")
	public void update(ExampleUsersDTO exampleDto);
	
	@DELETE
    @Path("/delete/{id}")
	public void delete(@PathParam("id") String id);
	
	@GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/load/{id}")
	public Object load(@PathParam("id") String id);
	
	@GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/query/{name}")
	public Object query(@PathParam("name") String name);
}
