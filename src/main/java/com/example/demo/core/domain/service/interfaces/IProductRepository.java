package com.example.demo.core.domain.service.interfaces;

import com.example.demo.core.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IProductRepository extends JpaRepository<Product, UUID> {}


