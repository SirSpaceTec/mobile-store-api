package com.itx.mobilestore.application.service;

import java.util.ArrayList;
import java.util.Iterator;
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
    for (CartItem item : cart) {
      if (item.getProduct().getId().equals(id) &&
          item.getColorCode() == colorCode &&
          item.getStorageCode() == storageCode) {
        item.setCantidad(item.getCantidad() + 1);
        return cart.stream().mapToInt(CartItem::getCantidad).sum();
      }
    }
    cart.add(new CartItem(product, colorCode, storageCode));
    return cart.stream().mapToInt(CartItem::getCantidad).sum();
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
        break;
      }
    }
    return cart.size();
  }

  @Override
  public int removeOneFromCart(String id, int colorCode, int storageCode) {
    for (Iterator<CartItem> it = cart.iterator(); it.hasNext();) {
      CartItem item = it.next();
      if (item.getProduct().getId().equals(id)
          && item.getColorCode() == colorCode
          && item.getStorageCode() == storageCode) {
        if (item.getCantidad() > 1) {
          item.setCantidad(item.getCantidad() - 1);
        } else {
          it.remove();
        }
        break;
      }
    }
    return cart.stream().mapToInt(CartItem::getCantidad).sum();
  }

}
