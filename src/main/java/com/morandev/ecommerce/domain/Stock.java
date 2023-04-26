package com.morandev.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class Stock {
    private Long stockId;
    private LocalDateTime fechaDeActualizacion;
    private Integer unidadesEntradas;
    private Integer unidadesSalidas;
    private String descripcion;
    private Integer balance;
    private Product producto;
}
