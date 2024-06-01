package com.multi.spring.model.xml.dto;

public class Pizza implements Food {

	@Override
	public void eat(String foodName) {
		System.out.println("집에서 "+ foodName + "피자를 먹는중 ~~~");

	}

}
