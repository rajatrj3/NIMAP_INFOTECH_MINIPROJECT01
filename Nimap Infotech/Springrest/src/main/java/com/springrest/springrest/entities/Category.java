package com.springrest.springrest.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_category")
public class Category {
	
	@OneToMany(mappedBy = "category")
	private List<Product> productlist;

	@Id
    private long catId;
	private String catName;
	
	
	//default Constructor
		public Category() {
			super();
			
		}
	// parametrized constructor
	public Category(long catId, String catName) {
		super();
		this.catId = catId;
		this.catName = catName;
	}
	
	//Getters and setters
	public long getCatId() {
		return catId;
	}
	public void setCatId(long catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + "]";
	}
	
	
	
	

}
