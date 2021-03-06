package com.infosys.project.order.dto;

public class ProductsDTO {
	Integer prodId;
	String brand;
	String category;
	String description;
	String image;
	String productname;
	String subcategory;
	Integer sellerId;
	Integer stock;
	double price;
	Integer rating;
	
	
	
	public Integer getProdid() {
		return prodId;
	}
	public void setProdid(Integer prodId) {
		this.prodId = prodId;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerid(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
}
