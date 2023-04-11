package com.morandev.ecommerce.application.repository;

import com.morandev.ecommerce.domain.Product;
import com.morandev.ecommerce.domain.User;
public interface IProductRepository { //PUERTO

    Iterable<Product> obtenerProductos();
    Iterable<Product> obtenerProductoPorUsuario(User user);
    Product obtenerProductoPorId(Long productoId);
    Product guardarProducto(Product product);
    void eliminarProductoPorId(Long id);

}
