package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Category;

public interface CategoryService {
	
public List<Category> getCategory();

	
	public Category getCategory(long catId);
	
	public Category addCategory(Category cat);


	public Category UpdateCategory(Category cat);


	public void deleteCategory(long parseLong);


}
