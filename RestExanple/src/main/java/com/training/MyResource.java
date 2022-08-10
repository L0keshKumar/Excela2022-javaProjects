package com.training;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		
		return "Hi loki";
	}
}


