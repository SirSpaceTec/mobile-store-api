package com.itx.mobilestore.domain.port.in;

public interface AddToCartUseCase {
  int addToCart(String id, int colorCode, int storageCode);
}
