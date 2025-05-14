package com.itx.mobilestore.dto;

public class ProductDto {
  private String id;
  private String marca;
  private String modelo;
  private Double precio;
  private String cpu;
  private Integer ram;
  private String sistemaOperativo;
  private String resolucionPantalla;
  private Integer bateria;
  private String camaras;
  private String dimensiones;
  private Integer peso;

  public ProductDto() {
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

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public Integer getRam() {
    return ram;
  }

  public void setRam(Integer ram) {
    this.ram = ram;
  }

  public String getSistemaOperativo() {
    return sistemaOperativo;
  }

  public void setSistemaOperativo(String sistemaOperativo) {
    this.sistemaOperativo = sistemaOperativo;
  }

  public String getResolucionPantalla() {
    return resolucionPantalla;
  }

  public void setResolucionPantalla(String resolucionPantalla) {
    this.resolucionPantalla = resolucionPantalla;
  }

  public Integer getBateria() {
    return bateria;
  }

  public void setBateria(Integer bateria) {
    this.bateria = bateria;
  }

  public String getCamaras() {
    return camaras;
  }

  public void setCamaras(String camaras) {
    this.camaras = camaras;
  }

  public String getDimensiones() {
    return dimensiones;
  }

  public void setDimensiones(String dimensiones) {
    this.dimensiones = dimensiones;
  }

  public Integer getPeso() {
    return peso;
  }

  public void setPeso(Integer peso) {
    this.peso = peso;
  }

}
