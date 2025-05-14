package com.itx.mobilestore.domain.model;

public class CartItem {
  private Product product;
  private int colorCode;
  private int storageCode;
  private int cantidad = 1;

  public CartItem(Product product, int colorCode, int storageCode) {
    this.product = product;
    this.colorCode = colorCode;
    this.storageCode = storageCode;
  }

  public Product getProduct() {
    return product;
  }

  public int getColorCode() {
    return colorCode;
  }

  public int getStorageCode() {
    return storageCode;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

}
