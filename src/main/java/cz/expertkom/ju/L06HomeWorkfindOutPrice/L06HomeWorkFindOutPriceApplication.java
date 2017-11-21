package cz.expertkom.ju.L06HomeWorkfindOutPrice;


import java.util.Arrays;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import cz.expertkom.ju.L06HomeWorkfindOutPrice.Api.FindPriceApi;
import cz.expertkom.ju.L06HomeWorkfindOutPrice.Api.Impl.FindPriceImpl;


@SpringBootApplication
public class L06HomeWorkFindOutPriceApplication {

	@Autowired
	Bus bus;
	
	public static void main(String[] args) {
		SpringApplication.run(L06HomeWorkFindOutPriceApplication.class, args);
	}
	
	/* metoda která vrátí anonymní třídu Api */
	@Bean
	public FindPriceApi findPrice() {
		return new FindPriceImpl();
	}
	
	/*JSON provider */
	
	/* JAXRSServerfactorybean */
	@Bean
	public Server jaxRsServerFactoryBean() {
		final JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		
		//endpoint.setProvider(provider);
		endpoint.setBus(bus);
		endpoint.setAddress("/expertkom/homework");
		endpoint.setServiceBeans(Arrays.<Object>asList(findPrice()));
		return endpoint.create();
	}
}
