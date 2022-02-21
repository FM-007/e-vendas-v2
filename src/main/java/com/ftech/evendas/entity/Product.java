package com.ftech.evendas.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long uniqueID;

  @Column(name = "NAME")
  private String name;

  @Column(name = "PRICE")
  private BigDecimal price;

  @Column(name = "QUANTITY")
  private Long quantity;

  @Column(name = "CREATED_AT")
  private Date created_at;

  @Column(name = "UPDATED_AT")
  private Date updated_at;

  public Product() {
  }

  public Product(Long uniqueID, String name, BigDecimal price, Long quantity,
      Date created_at, Date updated_at) {
    this.uniqueID = uniqueID;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.created_at = created_at;
    this.updated_at = updated_at;
  }

  public Long getUniqueID() {
    return uniqueID;
  }

  public void setUniqueID(Long uniqueID) {
    this.uniqueID = uniqueID;
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

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public Date getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return uniqueID.equals(product.uniqueID) && name.equals(product.name) && Objects.equals(
        price, product.price) && Objects.equals(quantity, product.quantity)
        && Objects.equals(created_at, product.created_at) && Objects.equals(
        updated_at, product.updated_at);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueID, name, price, quantity, created_at, updated_at);
  }

  @Override
  public String toString() {
    return "Product{" +
        "uniqueID=" + uniqueID +
        ", name='" + name + '\'' +
        ", price=" + price +
        ", quantity=" + quantity +
        ", created_at=" + created_at +
        ", updated_at=" + updated_at +
        '}';
  }
}
