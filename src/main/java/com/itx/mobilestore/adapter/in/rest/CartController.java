package com.itx.mobilestore.adapter.in.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itx.mobilestore.domain.port.in.AddToCartUseCase;
import com.itx.mobilestore.domain.port.in.GetCartUseCase;
import com.itx.mobilestore.dto.CartItemDto;
import com.itx.mobilestore.dto.CartRequestDto;
import com.itx.mobilestore.dto.CartResponseDto;
import com.itx.mobilestore.util.CartItemMapper;

@RestController
@RequestMapping("/api/cart")
public class CartController {
  private final AddToCartUseCase addToCartUseCase;
  private final GetCartUseCase getCartUseCase;

  public CartController(AddToCartUseCase addToCartUseCase, GetCartUseCase getCartUseCase) {
    this.addToCartUseCase = addToCartUseCase;
    this.getCartUseCase = getCartUseCase;
  }

  @PostMapping
  public CartResponseDto addToCart(@RequestBody CartRequestDto request) {
    int count = addToCartUseCase.addToCart(request.getId(), request.getColorCode(), request.getStorageCode());
    return new CartResponseDto(count);
  }

  @GetMapping
  public List<CartItemDto> getCart() {
    return getCartUseCase.getCartItems()
        .stream()
        .map(CartItemMapper::toDto)
        .toList();
  }

  @DeleteMapping
  public CartResponseDto removeFromCart(@RequestBody CartRequestDto request) {
    int count = getCartUseCase.removeFromCart(request.getId(), request.getColorCode(), request.getStorageCode());
    return new CartResponseDto(count);
  }

  @DeleteMapping("/all")
  public CartResponseDto clearCart() {
    getCartUseCase.clearCart();
    return new CartResponseDto(0);
  }

}
