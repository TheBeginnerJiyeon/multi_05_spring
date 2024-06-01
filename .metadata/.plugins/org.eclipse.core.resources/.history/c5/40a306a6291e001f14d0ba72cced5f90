package com.multi.section02.mapperscan.run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.multi.section02.mapperscan.model.dto.ProductDTO;
import com.multi.section02.mapperscan.model.service.ProductService;



public class Application {

	public static void main(String[] args) { 
		ApplicationContext context = new GenericXmlApplicationContext("com/multi/section02/mapperscan/config/spring-context.xml");
		
		System.out.println("전체 메뉴 조회하기");
		
		ProductService productService = context.getBean("productService", ProductService.class);
		
		List<ProductDTO> productList = productService.selectProductList();
		for(ProductDTO product : productList) {
			System.out.println(product);
		}

	}

}
