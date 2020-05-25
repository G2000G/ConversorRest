package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/CToK")
public class ConversorCToK {
	
	@GET
	@Produces("text/plain")
	public String temperatura(@QueryParam("temp") float temp) {
			temp=temp+273;
			return "A temperatura Celsius em Kelvin fica: " + temp;
	}
}
