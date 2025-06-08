package com.mx.MsInventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MsInventario.model.Inventario;
import com.mx.MsInventario.service.InventarioServImp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(path  = "inventario")
@CrossOrigin
public class InventarioWebServ {

	@Autowired
	InventarioServImp inventarioServImp;
	
	//http://localhost:8200/inventario/mostrar
	@GetMapping(path = "mostrar")
	public List<Inventario>mostrarInventario(){
		return inventarioServImp.listarInventario();
	}
	
	//http://localhost:9000/inventario/buscarProducto
	@GetMapping(path= "buscarProducto")
	public Inventario buscarProducto(@RequestBody Inventario inventario) {
		return inventarioServImp.buscarProducto(inventario.getIdProducto());
	}
	
	//http://localhost:9000/inventario/guardar
	@PostMapping(path = "guardar")
	public Inventario guardarProducto(@RequestBody Inventario inventario) {
		return inventarioServImp.guardarProducto(inventario);
	}
	
	//http://localhost:9000/inventario/buscaridSucursal
	@GetMapping(path = "buscaridSucursal")
	public List<Inventario> buscarxIdSucursal(@RequestBody Inventario inventario) {
		return inventarioServImp.buscarXidSucursal(inventario.getIdSucursal());
	}
	

}






















