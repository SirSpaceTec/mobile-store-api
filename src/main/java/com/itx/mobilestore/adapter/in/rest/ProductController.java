package com.itx.mobilestore.adapter.in.rest;

import org.springframework.web.bind.annotation.RestController;

import com.itx.mobilestore.domain.port.in.GetProductUseCase;
import com.itx.mobilestore.dto.ProductDto;
import com.itx.mobilestore.util.ProductMapper;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/product")
public class ProductController {

  private final GetProductUseCase getProductUseCase;

  public ProductController(GetProductUseCase getProductUseCase) {
    this.getProductUseCase = getProductUseCase;
  }

  @GetMapping
  public List<ProductDto> getAllProducts() {
    return getProductUseCase.getAllProducts()
        .stream()
        .map(ProductMapper::toDto)
        .toList();
  }

  @GetMapping("/{id}")
  public ProductDto getProductById(@PathVariable String id) {
    return getProductUseCase.getProductById(id)
        .map(ProductMapper::toDto)
        .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));
  }

}
