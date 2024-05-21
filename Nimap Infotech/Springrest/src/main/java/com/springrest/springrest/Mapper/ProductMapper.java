package com.springrest.springrest.Mapper;
import org.springframework.stereotype.Component;

import com.springrest.springrest.Dto.CategoryDTO;
import com.springrest.springrest.Dto.ProductDTO;
import com.springrest.springrest.entities.Category;
import com.springrest.springrest.entities.Product;



@Component
public class ProductMapper {

    public ProductDTO toDto(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setProdId(product.getProdId());
        dto.setProdname(product.getProdname());

        Category category = product.getCategory();
        if (category != null) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setCatId(category.getCatId());
            categoryDTO.setCatName(category.getCatName());
            dto.setCategory(categoryDTO);
        }

        return dto;
    }
}
