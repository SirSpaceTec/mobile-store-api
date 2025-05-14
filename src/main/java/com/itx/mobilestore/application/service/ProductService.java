package com.itx.mobilestore.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.itx.mobilestore.domain.model.Product;
import com.itx.mobilestore.domain.port.in.GetProductUseCase;
import com.itx.mobilestore.domain.port.out.ProductRepositoryPort;

@Service
public class ProductService implements GetProductUseCase {

  private final ProductRepositoryPort productRepository;

  public ProductService(ProductRepositoryPort productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public Optional<Product> getProductById(String id) {
    return productRepository.findById(id);
  }

}
