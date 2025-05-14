package com.itx.mobilestore.dto;

public class CartItemDto {
  private String id;
  private String marca;
  private String modelo;
  private double precio;
  private int colorCode;
  private int storageCode;

  public CartItemDto(String id, String marca, String modelo, double precio, int colorCode, int storageCode) {
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    this.colorCode = colorCode;
    this.storageCode = storageCode;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getColorCode() {
    return colorCode;
  }

  public void setColorCode(int colorCode) {
    this.colorCode = colorCode;
  }

  public int getStorageCode() {
    return storageCode;
  }

  public void setStorageCode(int storageCode) {
    this.storageCode = storageCode;
  }

}
