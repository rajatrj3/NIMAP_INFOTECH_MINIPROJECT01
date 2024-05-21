package com.springrest.springrest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.ProductDao;
import com.springrest.springrest.entities.Category;
import com.springrest.springrest.entities.Product;



@Service
public class ProductServiceImpl  implements ProductService{
	
	
	@Autowired
	private  ProductDao productDao;
	
	public ProductServiceImpl(){
		
	}
	
		
		
	

	
	

	@Override
	public List<Product> getProduct() {
		
		return productDao.findAll();
	}

	@Override
	public Product getProduct(long ProdId) {
		
		return productDao.getReferenceById(ProdId);
	}

	@Override
	public Product addProduct(Product product) {
	    return productDao.save(product);
	}

	@Override
	public Product  UpdateProduct(Product product) {
	    return productDao.save(product);
	}

     
	@SuppressWarnings("deprecation")
	@Override
	public void deleteProduct(long parseLong) {
		Product entity= productDao.getOne(parseLong);
		productDao.delete(entity);
	
		
	}








	@Override
	public Page<Product> getProducts(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
