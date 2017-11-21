package cz.expertkom.ju.L06HomeWorkfindOutPrice.Api.Impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import cz.expertkom.ju.L06HomeWorkfindOutPrice.Api.FindPriceApi;
import cz.expertkom.ju.interfaces.GetPriceInterface;
import cz.expertkom.ju.interfaces.entity.ProductPrice;

public class FindPriceImpl implements FindPriceApi {
	
	@Autowired
	GetPriceInterface getPriceInterface;
	
	@Override
	public Response getPrice(String htmlString) {
		ProductPrice productPrice = new ProductPrice();
		productPrice = getPriceInterface.getProductPrice(htmlString);
		System.out.println(productPrice);
		return Response.ok(productPrice).build();
	}
	

}
