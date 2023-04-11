package com.morandev.ecommerce.infrastructure.adapter.implementation;

import com.morandev.ecommerce.application.repository.IProductRepository;
import com.morandev.ecommerce.domain.Product;
import com.morandev.ecommerce.domain.User;
import com.morandev.ecommerce.infrastructure.adapter.IProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductCrudImpl implements IProductRepository {
    private final IProductCrudRepository productRepository;

    @Autowired
    public ProductCrudImpl(IProductCrudRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> obtenerProductos() {
        return this.productRepository.findAll();
    }

    @Override
    public Iterable<Product> obtenerProductoPorUsuario(User user) {
        return null;
    }

    @Override
    public Product obtenerProductoPorId(Long productoId) {
        return null;
    }

    @Override
    public Product guardarProducto(Product product) {
        return null;
    }

    @Override
    public void eliminarProductoPorId(Long id) {

    }
}
