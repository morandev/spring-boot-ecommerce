package com.morandev.ecommerce.infrastructure.adapter;

import com.morandev.ecommerce.infrastructure.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface IProductCrudRepository extends CrudRepository<ProductEntity, Long> {} //ADAPTADOR