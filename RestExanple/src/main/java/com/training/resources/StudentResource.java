package com.training.resources;

import jakarta.ws.rs.*;
import java.util.List;

import org.glassfish.grizzly.http.server.HttpServer;

import com.training.model.Student;
import com.training.services.StudentService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/students")
public class StudentResource {
	
	private static StudentService service = new StudentService();
	public StudentResource() {
		super();
			}
	
	
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
		
	return service.getAll();
	
	}
	
	
	
	@GET
	@Path("/{rollnumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("rollnumber")int id){
//		return service.findById(id)
//				.orElseThrow(()->new RuntimeException("Id not Found"));
		
		
		try {
			Student entity=service.findById(id)
					.orElseThrow(()-> new RuntimeException("Id not Found"));
			return Response.ok(entity).build();
		}catch(RuntimeException e) {
			e.printStackTrace();
			return Response.status(400,"Id Not Found").build();
		}
	}
	
	
	
	@DELETE
	@Path("/{rollnumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("rollnumber") int id) {
		boolean value=service.remove(id);
		if(value) {
			return Response.status(204,"Deleted").build();
		}
		else {
			return Response.status(400,"Id Not Found").build();
		}
	}

	/*
	 * @PUT
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON) public Student update(Student
	 * oldValue,Student newValue) { return this.service.update(oldValue, newValue);
	 * }
	 */
	
	@PUT
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateById(@PathParam("rollNumber") int id , Student newStudent)
	{
			return service.update(id,newStudent);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response add(Student student) {
		boolean result=service.add(student);
		if(result) {
			return Response.ok(student).status(201,"created").build();
		}
		else {
			return Response.status(400,"Not Created").build();
		}
		
	}

}
