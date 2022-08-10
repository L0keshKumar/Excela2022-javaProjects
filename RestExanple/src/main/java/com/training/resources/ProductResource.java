package com.training.resources;
import java.util.List;
import com.example.demo.services.ProductService;
import com.example.entity.Product;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/products")
public class ProductResource {

	private static ProductService service=new ProductService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findall(){
		
		return service.findAll();
		
	}
	
	@GET
	@Path("/srch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id")int id) {
		
		try {
			Product entity=service.findById(id)
					.orElseThrow(()-> new RuntimeException("Id not Found"));
			return Response.ok(entity).build();
		}catch(RuntimeException e) {
			e.printStackTrace();
			return Response.status(400,"Id Not Found").build();
		}
		
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Product entity) {
		int result=service.addProduct(entity);
		if(result!=0) {
			return Response.ok(entity).status(201,"created").build();
		}
		else {
			return Response.status(400,"Not Created").build();
		}
		
	}
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") int id ){
		
		
		
		int num=service.deletById(id);
		if(num!=0) {
			return Response.ok("one resource is deleted").build();
		}
		else {
			return Response.status(400,"not deleted").build();
		}
	}
	
	@PUT
	@Path("/{Name}/{price}")
	@Produces(MediaType.APPLICATION_JSON)
	public  Response update(@PathParam("Name")String productName,@PathParam("price")double newPrice ) {
		
		int num=service.updatePriceByName(productName, newPrice);
		if(num!=0) {
			return Response.ok("one row updated").status(201).build();
		}
		else {
			return Response.ok("Not updated").status(400).build();
		}
	}
	
		
}
