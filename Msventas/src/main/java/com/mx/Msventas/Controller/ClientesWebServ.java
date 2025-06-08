package com.mx.Msventas.Controller;

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

import com.mx.Msventas.model.Clientes;
import com.mx.Msventas.service.ClientesServImpl;


@RestController
@RequestMapping(path = "clientesWs")
@CrossOrigin
public class ClientesWebServ {
	
	@Autowired
	ClientesServImpl clientesServImpl;
	
	//http://localhost:8100/clientesWs
	@GetMapping
	public List<Clientes>listar() {
		return clientesServImpl.listar();
	}
	
	//http://localhost:8100/clientesWs
	@PostMapping
	public ResponseEntity<Clientes> guardar(@RequestBody Clientes cliente){
		return new ResponseEntity<>(clientesServImpl.guardar(cliente),HttpStatus.CREATED);
	}
	
	//http://localhost:8100/clientesWs/idCliente
	@GetMapping(path="/{idCliente}")
	public Clientes buscarCliente(@PathVariable("idCliente") Integer idCliente) {
		return clientesServImpl.buscarXid(idCliente);
	}
	
	//http://localhost:8100/clientesWs/surcursal/{idSucursal}
	//http://localhost:8031/clientesWs/surcursal/1
	@GetMapping(path = "/surcursal/{idSurcursal}")
	public List<Clientes> buscarClientesXidSucursal(@PathVariable("idSurcursal")Integer idSurcursal){
		return clientesServImpl.buscarXidSucursal(idSurcursal);
	}
}



























