package com.mx.Msventas.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mx.Msventas.model.Clientes;

public interface ClientesDao extends CrudRepository<Clientes,Integer>{

	//metodo bajo el resorte para buscar los clientes por idSucursal
	public List<Clientes> findByIdSucursal(Integer idSucursal);
	
	
	
	
	
}
