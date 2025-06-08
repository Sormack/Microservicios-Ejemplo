package com.mx.MsSucursales.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductosDTO {
	private Integer idProducto;
	private String nombre;
	private Float precio;
	private Integer idSucursal;
}
