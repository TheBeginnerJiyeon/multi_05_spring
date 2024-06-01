package com.multi.section01.connection.javaconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.multi.section01.connection.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

		
		System.out.println("전체 메뉴 조회하기");
		
		ProductService productService = (ProductService) context.getBean("productService");
		List<ProductDTO> productList = productService.selectProductList();
		for(ProductDTO product : productList) {
			System.out.println(product);
		}
	}

}
