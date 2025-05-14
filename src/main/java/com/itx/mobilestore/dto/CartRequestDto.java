package com.itx.mobilestore.dto;

public class CartRequestDto {
  private String id;
  private int colorCode;
  private int storageCode;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
