package com.morandev.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class User {
    private Long usuarioId;
    private String nombreDeUsuario;
    private String primerNombre;
    private String apellido;
    private String correoElectronico;
    private String direccion;
    private String numeroDeCelular;
    private String contrasenia;
    private UserType tipoDeUsuario;
    private LocalDateTime fechaDeCreacion;
}
