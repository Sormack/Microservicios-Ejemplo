package com.mx.MsSucursales.dto;

import lombok.Getter;
import lombok.Setter;

//DTO --POJO ---Tiene como finalidad la creacion de bjetos ---para transportar datos del objeto 
//DTO --es un patron de diseño
@Getter
@Setter
public class ClientesDTO {
	private String nombre;
	private String app;
	private String apm;
	private Integer idSucursal;
	
}
