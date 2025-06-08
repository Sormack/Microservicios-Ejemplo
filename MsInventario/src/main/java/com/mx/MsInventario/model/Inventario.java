package com.mx.MsInventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*CREATE TABLE PRODUCTOS_3B(
    ID_PRODUCTO NUMBER PRIMARY KEY,
    NOMBRE VARCHAR2(100)NOT NULL,
    PRECIO NUMBER NOT NULL,
    ID_SUCURSAL NUMBER NOT NULL ----LLAVE REFERNCIADA  
);
*/

@Entity
@Table(name ="PRODUCTOS_3B")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Inventario {
	@Id
	@Column(name = "ID_PRODUCTO")
	private Integer idProducto;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "PRECIO")
	private Float  precio;
	
	@Column(name = "ID_SUCURSAL")
	private Integer idSucursal;
}
