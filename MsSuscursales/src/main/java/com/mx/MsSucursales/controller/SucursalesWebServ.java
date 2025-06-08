package com.mx.MsSucursales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MsSucursales.dto.ClientesDTO;
import com.mx.MsSucursales.dto.ProductosDTO;
import com.mx.MsSucursales.entity.Sucursales;
import com.mx.MsSucursales.service.SucursaleServImp;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "sucursaleWS")
@CrossOrigin
public class SucursalesWebServ {
	@Autowired
	SucursaleServImp sucursaleServImp;
	
	//Peticiones propias del Ms padre o de sucursales
	//http://localhost:8300/sucursaleWS
	@GetMapping
	public List<Sucursales> listar(){
		return sucursaleServImp.listar();
	}
	
	@PostMapping
	public ResponseEntity<Sucursales> guardar(@RequestBody Sucursales sucursales){
		return new ResponseEntity<>(sucursaleServImp.guardar(sucursales),HttpStatus.CREATED);
	}
	//Peticiones propias del microservico de ventas 
	
	//http://localhost:8300/sucursaleWS/guardarClientes
	@PostMapping(path = "/guardarClientes")
	public ResponseEntity<ClientesDTO> guardarCliente(@RequestBody ClientesDTO cliente){
		return new ResponseEntity<ClientesDTO>(sucursaleServImp.guardarCliente(cliente),HttpStatus.CREATED);
	}
	//http://localhost:8300/sucursaleWS/clientes/1
	@GetMapping(path = "/clientes/{idSucursal}")
	public List<ClientesDTO> buscarClienteXidSucursal(@PathVariable("idSucursal") Integer idSucursal) {
		return sucursaleServImp.buscarClienteXidSucursal(idSucursal);
	}
	
	//Peticiones propias de inventario
	//http://localhost:8300/sucursaleWS/listarInventario
	@GetMapping(path= "listarInventario")
	public List<ProductosDTO> mostrar() {
		return sucursaleServImp.mostrar();
	}
	
	//http://localhost:8300/sucursaleWS/guardarProducto
	@PostMapping(path = "guardarProducto")
	public ProductosDTO guardarProducto(@RequestBody ProductosDTO producto) {
		return sucursaleServImp.guardarProducto(producto);
	}
	
	
	
}



















