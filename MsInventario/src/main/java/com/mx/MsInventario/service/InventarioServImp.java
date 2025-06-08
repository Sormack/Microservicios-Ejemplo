package com.mx.MsInventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.MsInventario.dao.InventarioDao;
import com.mx.MsInventario.model.Inventario;

@Service
public class InventarioServImp {
	@Autowired
	InventarioDao inventarioDao;
	
	//Mostrar inventarios 
	@Transactional(readOnly = true)
	public List<Inventario> listarInventario(){
		return (List<Inventario>) inventarioDao.findAll();
	}
	
	//Buscar un producto
	@Transactional(readOnly = true)
	public Inventario buscarProducto(Integer idProducto) {
		return inventarioDao.findById(idProducto).orElse(null);
	}
	
	//Guardar un nuevo producto 
	@Transactional
	public Inventario guardarProducto(Inventario producto) {
		return inventarioDao.save(producto);
	}
	
	@Transactional(readOnly = true)
	public List<Inventario> buscarXidSucursal(Integer idSucursal) {
		return inventarioDao.findByIdSucursal(idSucursal);
	}
	
	
}
