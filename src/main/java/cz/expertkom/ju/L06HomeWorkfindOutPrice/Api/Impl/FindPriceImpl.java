package cz.expertkom.ju.L06HomeWorkfindOutPrice.Api.Impl;

import javax.ws.rs.core.Response;

import cz.expertkom.ju.L06HomeWorkfindOutPrice.Api.FindPriceApi;

public class FindPriceImpl implements FindPriceApi {

	@Override
	public Response getPrice(String htmlString) {
		String s = "Hello World: "+htmlString;
		return Response.ok(s).build();
	}
	

}
