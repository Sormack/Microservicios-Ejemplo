package com.mx.MsSucursales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.mx.MsSucursales.dto.ClientesDTO;
import com.mx.MsSucursales.dto.ProductosDTO;
import com.mx.MsSucursales.entity.Sucursales;
import com.mx.MsSucursales.openFeingClientes.IFeingClientes;
import com.mx.MsSucursales.openFeingClientes.IFeingProductos;
import com.mx.MsSucursales.repsoitory.SurcursaleRepository;

@Service
//@SuppressWarnings("unchecked")
public class SucursaleServImp {
	@Autowired
	SurcursaleRepository surcursaleRepository;
	//Estos metodos son propios del MS padre o general 
	@Transactional(readOnly = true)
	public List<Sucursales> listar(){
		return surcursaleRepository.findAll();
	}
	@Transactional
	public Sucursales guardar(Sucursales sucursal) {
		return surcursaleRepository.save(sucursal);
	}
	
	//Estos son metodos propios del MS ventas o Proyecto hijo
	//Realizar la inyeccion de dependencias 
	//1-FeignClient
	//2-RestTempleate
	@Autowired
	IFeingClientes iFeingClientes;
	@Transactional
	public ClientesDTO guardarCliente(ClientesDTO cliente) {
		return iFeingClientes.guardar(cliente);
	}
	
	//Comunicacion con rest templeate
	@Autowired
	RestTemplate restTemplate;
	@Transactional
	public List<ClientesDTO> buscarClienteXidSucursal (Integer idScursal){
		List<ClientesDTO> listaNueva = restTemplate.getForObject("http://localhost:8100/clientesWs/surcursal/"+idScursal,List.class);
		return listaNueva;
	}
	
	//---------Peticiones propias de ms inventario---------//
	
	@Autowired
	IFeingProductos ifeingProductos;
	
	@Transactional
	public List<ProductosDTO> mostrar(){
		return ifeingProductos.mostrarProductos();
	}
	
	@Transactional
	public ProductosDTO guardarProducto(ProductosDTO producto) {
		return ifeingProductos.guardar(producto);
	}
	
	
	
}































