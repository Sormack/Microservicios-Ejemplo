package com.mx.MsSucursales.openFeingClientes; 

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mx.MsSucursales.dto.ProductosDTO;

@FeignClient(name ="Ms-Inventario",url= "http://localhost:8200",path = "/inventario")
public interface IFeingProductos {
	@GetMapping(path = "mostrar")
	public List<ProductosDTO> mostrarProductos();
	
	@PostMapping(path = "guardar")
	public ProductosDTO guardar(@RequestBody ProductosDTO prducto);
}
