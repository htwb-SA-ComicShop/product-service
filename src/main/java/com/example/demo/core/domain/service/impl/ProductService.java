package com.example.demo.core.domain.service.impl;

import com.example.demo.core.domain.model.Product;
import com.example.demo.core.domain.service.interfaces.IProductRepository;
import com.example.demo.core.domain.service.interfaces.IProductService;
import com.example.demo.port.user.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {
    private final IProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(UUID id) {
        productRepository
                .findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        productRepository.deleteById(id);
    }

    @Override
    public Product getProduct(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Product ID is invalid.");
        }
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
