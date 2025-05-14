package com.itx.mobilestore.adapter.out.h2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itx.mobilestore.domain.model.Product;

public interface SpringDataProductRepository extends JpaRepository<Product, String> {

}
