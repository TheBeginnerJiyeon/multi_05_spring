package com.multi.mvc000;

public class CoffeeMain2 {

	public static void main(String[] args) {
//		Coffee2 c3 = new Coffee2();
//		System.out.println(c3);
		Coffee2 c1 = Coffee2.getInstance();
		System.out.println(c1);
		Coffee2 c2 = Coffee2.getInstance();
		System.out.println(c2);
	}
}
