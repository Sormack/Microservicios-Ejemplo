package com.mx.MsSucursales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //Esta es una liberia de java que permite a los desarrolladores 
					//crear facilmente clientes http--para comunicacion de los ms
public class MsSuscursalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSuscursalesApplication.class, args);
	}

}
