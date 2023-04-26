package com.morandev.ecommerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table( name = "ec_productos" )
@NoArgsConstructor
@Data
public class ProductEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long productoId;
    private String codProducto;
    private String nombreProducto;
    private String descripcion;
    private String imagen;
    private BigDecimal precio;

    private LocalDateTime fechaDeCreacion;
    private LocalDateTime fechaDeActualizacion;

    @ManyToOne
    private UserEntity usuario;
}
