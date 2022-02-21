package com.ftech.evendas.domain.mapper;

import com.ftech.evendas.domain.dto.ProductDto;
import com.ftech.evendas.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {

  @Mapping(target = "uniqueID", ignore = true)
  @Mapping(target = "created_at", ignore = true)
  @Mapping(target = "updated_at", ignore = true)
  public abstract Product toEntity(ProductDto productDto);

}
