package com.itx.mobilestore.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itx.mobilestore.domain.model.CartItem;
import com.itx.mobilestore.domain.model.Product;
import com.itx.mobilestore.domain.port.in.AddToCartUseCase;
import com.itx.mobilestore.domain.port.in.GetCartUseCase;
import com.itx.mobilestore.domain.port.out.ProductRepositoryPort;

@Service
public class CartService implements AddToCartUseCase, GetCartUseCase {

  private final List<CartItem> cart = new ArrayList<>();
  private final ProductRepositoryPort productRepository;

  public CartService(ProductRepositoryPort productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public int addToCart(String id, int colorCode, int storageCode) {
    Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    cart.add(new CartItem(product, colorCode, storageCode));
    return cart.size();
  }

  @Override
  public List<CartItem> getCartItems() {
    return new ArrayList<>(cart);
  }

  @Override
  public void clearCart() {
    cart.clear();
  }

  @Override
  public int removeFromCart(String id, int colorCode, int storageCode) {
    for (int i = 0; i < cart.size(); i++) {
      CartItem item = cart.get(i);
      if (item.getProduct().getId().equals(id) &&
          item.getColorCode() == colorCode &&
          item.getStorageCode() == storageCode) {
        cart.remove(i);
        break; // 🔁 Detener tras la primera eliminación
      }
    }
    return cart.size();
  }

}
