package com.morandev.ecommerce.infrastructure.adapter.implementation;

import com.morandev.ecommerce.application.repository.IProductRepository;
import com.morandev.ecommerce.domain.Product;
import com.morandev.ecommerce.domain.User;
import com.morandev.ecommerce.infrastructure.adapter.IProductCrudRepository;
import com.morandev.ecommerce.infrastructure.entity.ProductEntity;
import com.morandev.ecommerce.infrastructure.mapper.IProductMapper;
import com.morandev.ecommerce.infrastructure.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProductCrudImpl implements IProductRepository {
    private final IProductCrudRepository productRepository;
    private final IProductMapper productMapper;
    private final IUserMapper userMapper;

    @Autowired
    public ProductCrudImpl(IProductCrudRepository productRepository, IProductMapper productMapper, IUserMapper userMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
        this.userMapper = userMapper;
    }

    @Override
    public Iterable<Product> obtenerProductos() {
        return productMapper.toProductIterable(this.productRepository.findAll());
    }

    @Override
    public Iterable<Product> obtenerProductosPorUsuario(User user) {
        return productMapper.toProductIterable(this.productRepository.findByUsuario(userMapper.toUserEntity(user)));
    }

    @Override
    public Product obtenerProductoPorId(Long productoId) {
        Optional<ProductEntity> productoEncontrado = this.productRepository.findById(productoId);

        if (productoEncontrado.isPresent())
            return productMapper.toProduct(productoEncontrado.get());

        throw new RuntimeException("Producto " + productoId + " no encontrado");
    }

    @Override
    public Product guardarProducto(Product product) {
        return productMapper.toProduct(this.productRepository.save(productMapper.toProductEntity(product)));
    }

    @Override
    public void eliminarProductoPorId(Long id) {
        this.productRepository.deleteById(id);
    }
}
