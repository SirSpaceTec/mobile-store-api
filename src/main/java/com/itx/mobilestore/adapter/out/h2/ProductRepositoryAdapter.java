package com.itx.mobilestore.adapter.out.h2;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.itx.mobilestore.domain.model.Product;
import com.itx.mobilestore.domain.port.out.ProductRepositoryPort;

@Repository
public class ProductRepositoryAdapter implements ProductRepositoryPort {

  private final SpringDataProductRepository repository;

  public ProductRepositoryAdapter(SpringDataProductRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Product> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Product> findById(String id) {
    return repository.findById(id);
  }

}
