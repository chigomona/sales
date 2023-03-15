package com.eshop.ws.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class MathConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this is the package name specified in the <generatePackage> specified in pom.xml
		marshaller.setContextPath("com.eshop.ws.schemas.math");
		return marshaller;
	}

	@Bean
	public MathClient mathClient(Jaxb2Marshaller marshaller) {
		MathClient client = new MathClient();
		client.setDefaultUri("http://localhost:8080/SimpleWebService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}