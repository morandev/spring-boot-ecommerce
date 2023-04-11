package com.morandev.ecommerce.infrastructure.mapper;

import com.morandev.ecommerce.domain.User;
import com.morandev.ecommerce.infrastructure.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "spring" )
public interface IUserMapper {

    @Mappings({
            @Mapping( source = "usuarioId", target = "usuarioId"),
            @Mapping( source = "nombreDeUsuario", target = "nombreDeUsuario"),
            @Mapping( source = "primerNombre", target = "primerNombre"),
            @Mapping( source = "apellido", target = "apellido"),
            @Mapping( source = "correoElectronico", target = "correoElectronico"),
            @Mapping( source = "direccion", target = "direccion"),
            @Mapping( source = "numeroDeCelular", target = "numeroDeCelular"),
            @Mapping( source = "contrasenia", target = "contrasenia"),
            @Mapping( source = "fechaDeCreacion", target = "fechaDeCreacion")
    })
    User toUser(UserEntity entity);

    Iterable<User> toUserIterable(Iterable<UserEntity> entities);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);


}
