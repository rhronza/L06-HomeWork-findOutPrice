package cz.expertkom.ju.L06HomeWorkfindOutPrice.Api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;

@CrossOriginResourceSharing(allowAllOrigins =true)
public interface FindPriceApi {
	@GET
	@Path("parametrURI/{valueURI}")
	@Consumes(MediaType.WILDCARD)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPrice(@PathParam(value = "valueURI") String valueURI);

}
