package com.multi.spring.model.anno.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// 스프링 설정 클래스로 지정하고 스프링 빈으로 등록하겠다 
public class BeanFactory {

	
	@Bean // 메소드가 생성한 객체를 스프링이 관리하는 빈으로 등록하겠다.
	public Person2 createPerson() {
		Person2 p2 = new Person2();
		p2.setName("남주혁");
		
		Food myfood = new Chicken();
		p2.setMyFood(myfood);
		
		return p2;
	}
	
	@Bean // 메소드가 생성한 객체를 스프링이 관리하는 빈으로 등록하겠다.
	public Person2 createPerson2() {

		Food myfood = new Chicken();
		
		
		return new Person2("로운", myfood);
	}
}
