package com.itx.mobilestore.util;

import com.itx.mobilestore.domain.model.CartItem;
import com.itx.mobilestore.domain.model.Product;
import com.itx.mobilestore.dto.CartItemDto;

public class CartItemMapper {
  public static CartItemDto toDto(CartItem item) {
    Product p = item.getProduct();
    return new CartItemDto(
        p.getId(),
        p.getMarca(),
        p.getModelo(),
        p.getPrecio(),
        item.getColorCode(),
        item.getStorageCode(),
        item.getCantidad());
  }
}
