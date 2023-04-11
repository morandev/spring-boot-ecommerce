package com.morandev.ecommerce.infrastructure.mapper;

import com.morandev.ecommerce.domain.Product;
import com.morandev.ecommerce.infrastructure.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 *  Como un producto tiene una dependencia Usuario,
 *  hay que utilizar el parametro "uses" de la
 *  anotacion @Mapper
 *
 */
@Mapper( componentModel = "spring", uses = {IUserMapper.class})
public interface IProductMapper {

    @Mappings({
            @Mapping( source = "productoId" , target = "productoId" ),
            @Mapping( source = "codProducto" , target = "codProducto" ),
            @Mapping( source = "nombreProducto" , target = "nombreProducto" ),
            @Mapping( source = "descripcion" , target = "descripcion" ),
            @Mapping( source = "imagen" , target = "imagen" ),
            @Mapping( source = "precio" , target = "precio" ),
            @Mapping( source = "fechaDeCreacion" , target = "fechaDeCreacion" ),
            @Mapping( source = "fechaDeActualizacion" , target = "fechaDeActualizacion" ),
            @Mapping( source = "usuario" , target = "usuario" ),
    })
    Product toProduct(ProductEntity entity);

    Iterable<Product> toProductIterable(Iterable<ProductEntity> entities);

    @InheritInverseConfiguration
    ProductEntity toProductEntity(Product product);
}
