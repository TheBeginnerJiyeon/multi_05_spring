package com.multi.spring.model.anno.dto;

public class Person2 {

	private String name;
	private Food myFood;
	
	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public Person2(String name, Food myFood) {
		super();
		this.name = name;
		this.myFood = myFood;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Food getMyFood() {
		return myFood;
	}

	public void setMyFood(Food myFood) {
		this.myFood = myFood;
	}

	@Override
	public String toString() {
		return name + "~~~" + myFood;
	}


	
	
}
