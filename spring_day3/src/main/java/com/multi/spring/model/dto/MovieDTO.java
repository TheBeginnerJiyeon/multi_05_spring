package com.multi.spring.model.dto;

public class MovieDTO {
	
	
	private String title;
	private int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MovieDTO [title=" + title + ", price=" + price + "]";
	}
	
	

	
	
	
	
	
}
