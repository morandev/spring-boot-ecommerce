package com.morandev.ecommerce.application.service;

import com.morandev.ecommerce.application.repository.IProductRepository;
import com.morandev.ecommerce.domain.Product;
import com.morandev.ecommerce.domain.User;

public class ProductService {
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> obtenerProductos(){
        return  productRepository.obtenerProductos()
    }

    public Iterable<Product> obtenerProductoPorUsuario(User user){
        return productRepository.obtenerProductoPorUsuario(user);
    }

    public Product obtenerProductoPorID(Integer id){
        return  productRepository.obtenerProductoPorId(id);
    }

    public Product guardarProducto(Product product){
        return   productRepository.guardarProducto(product);
    }

    public void eliminarProductoPorID(Integer id){
        productRepository.eliminarProductoPorId(id);
    }
}
