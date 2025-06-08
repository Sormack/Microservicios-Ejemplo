package com.mx.MsSucursales.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*CREATE TABLE SUCURSALES_3B(
    ID_SUCURSAL NUMBER PRIMARY KEY,
    NOMBRE VARCHAR2(80) NOT NULL,
    FECHA_APERTURA DATE NOT NULL
);*/
@Entity
@Table(name = "SUCURSALES_3B")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sucursales {
	@Id
	@Column(name = "ID_SUCURSAL")
	private Integer idSucursal;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "FECHA_APERTURA")
	private Date fechaApertura;
	
	
}












