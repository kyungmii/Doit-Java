package ch12;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class RestApiExample {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(@QueryParam("name")String name) {
		return "안녕하세요, "+ name +"님";
		
	}
	
//	@POST
//	public String sayHello2() {
//		return "API Service";
//		
//	}


}
