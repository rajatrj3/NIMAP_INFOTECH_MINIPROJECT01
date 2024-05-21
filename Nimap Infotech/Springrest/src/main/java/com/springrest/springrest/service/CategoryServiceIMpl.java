package com.springrest.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CategoryDao;
import com.springrest.springrest.entities.Category;


@Service
public class CategoryServiceIMpl implements CategoryService {

	
	@Autowired
	private CategoryDao categoryDao;
	
	public  CategoryServiceIMpl()
	{
		
	}
	
	@Override
	public List<Category> getCategory() {
		
		return categoryDao.findAll();
	}

	@Override
	public Category getCategory(long catId) {
		
		return categoryDao.getReferenceById(catId);
	}

	@Override
	public Category addCategory(Category cat) {
		categoryDao.save(cat);
		return cat;
	}

	@Override
	public Category UpdateCategory(Category cat) {
		categoryDao.save(cat);
		return cat;
	}
	@SuppressWarnings("deprecation")
	@Override
	public void deleteCategory(long parseLong) {
		Category entity=categoryDao.getOne(parseLong);
	    categoryDao.delete(entity);
		
	}

	
	

}