package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/KToC")
public class ConversorKToC {
	
	@GET
	@Produces("text/plain;charset=UTF-8")
	public String temperatura(@QueryParam("temp") float temp) {
			temp=temp-273;
			return "A temperatura kelvin em Celsius fica: " + temp + "º";
	}
}
