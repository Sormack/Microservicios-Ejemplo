package com.mx.MsInventario.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mx.MsInventario.model.Inventario;

public interface InventarioDao extends CrudRepository<Inventario, Integer>{
	//metodo bajo el resorte para buscar los clientes por idSucursal
		public List<Inventario> findByIdSucursal(Integer idSucursal);
}
