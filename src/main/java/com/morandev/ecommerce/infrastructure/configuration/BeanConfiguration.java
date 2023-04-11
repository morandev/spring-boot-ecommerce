package com.morandev.ecommerce.infrastructure.configuration;

import com.morandev.ecommerce.application.repository.IProductRepository;
import com.morandev.ecommerce.application.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ProductService productService(IProductRepository productRepository) {
        return new ProductService(productRepository);
    }
}
