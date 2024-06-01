package com.multi.spring.model.anno.dto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component 는 클래스 레벨에서 선언함으로써 스프링이 런타임시에 컴포넌트스캔을 하여 자동으로 빈을 찾고(detect) 등록하는 애노테이션

@Primary // @Autowired 시에 여러 빈이 매칭되면 @Primary가 우선권을 가진다!
@Component("chicken") // bean의 Id는 lower Camel Case(앞자리 소문자)를 사용. 암것도 안쓰면 디폴트도 그럼. ()에 별칭(이름) 작성하지 않았을 때가 디폴트로 나옴
public class Chicken implements Food {

	@Override
	public void eat(String foodName) {
		System.out.println("한강에서 " + foodName + "치킨을 먹는중 ~~");

	}

	@Override
	public String toString() {
		return "Chicken []";
	}
	
	

}
