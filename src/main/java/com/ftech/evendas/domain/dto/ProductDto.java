package com.ftech.evendas.domain.dto;

import java.math.BigDecimal;

public class ProductDto {

  private String name;
  private BigDecimal price;
  private Long quantity;

  public ProductDto() {
  }

  public ProductDto(String name, BigDecimal price, Long quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }
}
