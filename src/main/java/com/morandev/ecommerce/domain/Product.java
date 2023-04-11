package com.morandev.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class Product {
    private Long productoId;
    private String codProducto;
    private String nombreProducto;
    private String descripcion;
    private String imagen;
    private BigDecimal precio;

    private LocalDateTime fechaDeCreacion;
    private LocalDateTime fechaDeActualizacion;
}
