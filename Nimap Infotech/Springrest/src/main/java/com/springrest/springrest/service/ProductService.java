package com.springrest.springrest.service;


import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



import com.springrest.springrest.entities.Product;

public interface ProductService {
	
     public List<Product> getProduct();


     Page<Product> getProducts(Pageable pageable);

	
	public Product getProduct(long ProdId);
	
	public Product addProduct(Product product);


	public Product UpdateProduct(Product product);


	public void deleteProduct(long parseLong);

}
