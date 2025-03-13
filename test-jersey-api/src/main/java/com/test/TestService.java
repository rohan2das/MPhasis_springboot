package com.test;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 

@Path("/hello")
public class TestService {
 
  @GET
  @Path("/text")
  @Produces(MediaType.TEXT_PLAIN)
  public String getTestService() {
    return "Hello World! This is coming from webservice!!";
  }
  

	@GET
	@Path("/html/{msg}")
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtmlResponse(@PathParam("msg") String msg) {
		
		return "<html><body><h1>Hi this is html resopnse "+msg+" </h1></body></html>";
	}
  
}