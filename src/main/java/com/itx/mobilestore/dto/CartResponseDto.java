package com.itx.mobilestore.dto;

public class CartResponseDto {
  private int count;

  public CartResponseDto(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
