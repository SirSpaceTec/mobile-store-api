package com.itx.mobilestore.domain.port.in;

import java.util.List;

import com.itx.mobilestore.domain.model.CartItem;

public interface GetCartUseCase {
  List<CartItem> getCartItems();

  void clearCart();

  int removeFromCart(String id, int colorCode, int storageCode);

  int removeOneFromCart(String id, int colorCode, int storageCode);

}
