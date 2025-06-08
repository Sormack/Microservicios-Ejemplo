package com.mx.MsSucursales.configRestTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//Para empezar a configurar la clase rest template
public class ConfigRestTemplate {
	//@Bean es una clase que realiza una isntacia a a la clase restTemplade
	//RestTemplate es una clas de spring que idica o ayuda a trabajr con 
	//servicios  rest--utilizando el protocolo http--para la comunicacion de ms
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
