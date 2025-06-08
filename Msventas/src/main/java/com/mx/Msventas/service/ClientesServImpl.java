package com.mx.Msventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.Msventas.dao.ClientesDao;
import com.mx.Msventas.model.Clientes;


@Service
public class ClientesServImpl {
	@Autowired
	ClientesDao clientesDao;
	
	@Transactional(readOnly = true)
	public List<Clientes> listar(){
		return  (List<Clientes>) clientesDao.findAll();
	}
	
	@Transactional
	public Clientes guardar(Clientes cliente) {
		return clientesDao.save(cliente);
	}
	
	@Transactional(readOnly = true)
	public Clientes buscarXid(Integer idCliente) {
		return clientesDao.findById(idCliente).orElse(null);
	}

	@Transactional(readOnly = true)
	public List<Clientes> buscarXidSucursal(Integer idSucursal){
		return clientesDao.findByIdSucursal(idSucursal);
	}
	
}























