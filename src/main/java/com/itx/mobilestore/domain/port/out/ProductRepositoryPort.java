package com.itx.mobilestore.domain.port.out;

import com.itx.mobilestore.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryPort {

  List<Product> findAll();

  Optional<Product> findById(String id);
}
