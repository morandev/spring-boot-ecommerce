package com.morandev.ecommerce.infrastructure.adapter;

import com.morandev.ecommerce.infrastructure.entity.ProductEntity;
import com.morandev.ecommerce.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IProductCrudRepository extends CrudRepository<ProductEntity, Long> {
    Iterable<ProductEntity> findByNombreProducto(String nombre);
    Iterable<ProductEntity> findByUsuario(UserEntity usuario);

} //ADAPTADOR