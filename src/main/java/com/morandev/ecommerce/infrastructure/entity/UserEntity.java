package com.morandev.ecommerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table( name = "ec_usuarios" )
@NoArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long usuarioId;
    private String nombreDeUsuario;
    private String primerNombre;
    private String apellido;
    private String correoElectronico;
    private String direccion;
    private String numeroDeCelular;
    private String contrasenia;
    private LocalDateTime fechaDeCreacion;

}
