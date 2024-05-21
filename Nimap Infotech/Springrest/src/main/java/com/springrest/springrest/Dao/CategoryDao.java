package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Category;

public interface CategoryDao extends JpaRepository<Category, Long>{

}
