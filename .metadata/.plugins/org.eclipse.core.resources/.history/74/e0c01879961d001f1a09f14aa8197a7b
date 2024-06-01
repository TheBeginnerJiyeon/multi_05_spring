package com.multi.spring.c_locale;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.multi.spring.c_locale.config.ContextConfiguration;




public class Application {

	public static void main(String[] args) {
		// I18N 소프트웨어의 국제화 (Internationalization에서 첫글자인 I와 마지막글자인 N 사이 알파벳 갯수가 18개)
		//(국제화 말고 현지화도 있음(Localization (L10N): 현지화 - 정서적, 문화적 고려))
		 /*error.404=페이지를 찾을 수 없습니다!
		 * error.500=개발자의 잘못입니다. 개발자는 누구? {0} 입니다. 현재시간 {1}
		 * 
		 * 
		 * error.404=Page Not Found!!
		   error.500=something wrong! The developer''s fault. who is developer? It''s {0} at {1}*/

		
		//getMessage("읽어올메세지 키값", 메세지에 전달할 데이터  없으면 null, 로케일 );
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		
		String error404Message = context.getMessage("error.404", null, Locale.US);//Locale.KOREA
		String error500Message = context.getMessage("error.500", new Object[] {"jenny", new Date()}, Locale.US);
		
		System.out.println("The I18N message for error.404 : " + error404Message);
		System.out.println("The I18N message for error.500 : " + error500Message);
	}

}
