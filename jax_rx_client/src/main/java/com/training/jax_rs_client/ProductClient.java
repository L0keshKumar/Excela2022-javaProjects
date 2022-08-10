package com.training.jax_rs_client;

import com.example.entity.Product;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {
	public static void main(String args[]) {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8080/products");
		Invocation.Builder builder=
				target.request(MediaType.APPLICATION_JSON);
		Response resp=builder.get();
		int i=2;
		if(i==1)
		{
			String object=resp.readEntity(String.class);
			System.out.println(object);
		}
		if(i==2) {
			//.path() will add the path to the base path
			WebTarget findByIdTarget=target.path("/srch").path("/501");
			
			Invocation.Builder targetBuilder=
					findByIdTarget.request(MediaType.APPLICATION_JSON);
			
			Response targetResp=targetBuilder.get();
			
			Product object=targetResp.readEntity(Product.class);
			
			System.out.println(object);
		}
		if(i==3)
		{
			Product toAdd=new Product(502, "m24", 5000);
			Response response=builder.
					post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
			System.out.println(response.getStatus());
			System.out.println(response.readEntity(String.class));
		}
		if(i==4)
		{
			Product[] list=resp.readEntity(Product[].class);
			for(Product eachProduct:list) {
				System.out.println(eachProduct);
			}
		}
	}
}
