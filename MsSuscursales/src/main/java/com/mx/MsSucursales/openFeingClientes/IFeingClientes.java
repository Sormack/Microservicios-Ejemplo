package com.mx.MsSucursales.openFeingClientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mx.MsSucursales.dto.ClientesDTO;

//Para empezar a comunicar nuestro microservicios ms
//@FeignClient --cliente fingido--recibe parametros --- nombre-ms,url-Servidor local-ms,path-clase-ms
@FeignClient(name = "Ms-ventas",url="http://localhost:8100",path= "/clientesWs")
public interface IFeingClientes {
	@PostMapping
	public ClientesDTO guardar(@RequestBody ClientesDTO cliente);
}
