package com.springrest.springrest.Dto;

public class ProductDTO {
	  public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(long prodId, String prodname, CategoryDTO category) {
		super();
		ProdId = prodId;
		Prodname = prodname;
		this.category = category;
	}
	private long ProdId;
	    private String Prodname;
	    private CategoryDTO category;
	    
	    
	    
	    
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
		public CategoryDTO getCategory() {
			return category;
		}
		public void setCategory(CategoryDTO category) {
			this.category = category;
		}

}
