package com.morandev.ecommerce.infrastructure.entity;

import com.morandev.ecommerce.domain.Product;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;

@Entity
@Table( name = "ec_stocks")
@NoArgsConstructor
@Data
public class StockEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long stockId;
    private LocalDateTime fechaDeActualizacion;
    private Integer unidadesEntradas;
    private Integer unidadesSalidas;
    private String descripcion;
    private Integer balance;

    @ManyToOne
    @OnDelete( action = OnDeleteAction.CASCADE ) //al eliminar un stock se elimina el inventario de productos
    private ProductEntity producto;
}
