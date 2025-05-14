package com.itx.mobilestore.domain.port.in;

import java.util.List;
import java.util.Optional;

import com.itx.mobilestore.domain.model.Product;

public interface GetProductUseCase {
  List<Product> getAllProducts();

  Optional<Product> getProductById(String id);
}
