package com.mx.Msventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //Se agrega para que se registre en eureka server
public class MsventasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsventasApplication.class, args);
	}

}
