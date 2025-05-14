package com.itx.mobilestore.util;

import com.itx.mobilestore.domain.model.Product;
import com.itx.mobilestore.dto.ProductDto;

public class ProductMapper {
  public static ProductDto toDto(Product product) {
    ProductDto dto = new ProductDto();
    dto.setId(product.getId());
    dto.setMarca(product.getMarca());
    dto.setModelo(product.getModelo());
    dto.setPrecio(product.getPrecio());
    dto.setCpu(product.getCpu());
    dto.setRam(product.getRam());
    dto.setSistemaOperativo(product.getSistemaOperativo());
    dto.setResolucionPantalla(product.getResolucionPantalla());
    dto.setBateria(product.getBateria());
    dto.setCamaras(product.getCamaras());
    dto.setDimensiones(product.getDimensiones());
    dto.setPeso(product.getPeso());
    return dto;
  }
}
