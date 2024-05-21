package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="jpa_product")
public class Product {
	
	
	@ManyToOne
	@JoinColumn(name="catId")
	private Category category;	
	
	
    @Id
	private long ProdId;
	private String Prodname;
	
	

	
	//default constructor
	public Product() {
		super();
		
	}
	//parameterized cons
	public Product(long prodId, String prodname) {
		super();
		ProdId = prodId;
		Prodname = prodname;
	}
	
	//getters and setters
	public long getProdId() {
		return ProdId;
	}
	public void setProdId(long prodId) {
		ProdId = prodId;
	}
	public String getProdname() {
		return Prodname;
	}
	public void setProdname(String prodname) {
		Prodname = prodname;
	}
	
	
	//toString methods
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", Prodname=" + Prodname + "]";
	}
	
	}
