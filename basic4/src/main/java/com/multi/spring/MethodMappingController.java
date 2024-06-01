package com.multi.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodMappingController {

	// 1. Model 객체 사용하는 방법

	// Model 이라는 객체를 사용 하여 응답뷰로 전달하고자 하는 데이터를 맵형식(key,value) 로 담을수 있다.
	// scope 는 request 이다.
	// @RequestMapping(value = "/menu/regist", method = RequestMethod.POST)
	// 디폴트는 get
	
	
	@RequestMapping("/menu/regist")
	public String registMenu(Model model) {

		System.out.println("메소드 호출 확인 - registMenu() get");

		model.addAttribute("message", "신규 메뉴 등록");

		return "mappingResult";

	}
	
	
	@RequestMapping(value = "/menu/regist", method = RequestMethod.POST)
	public String registMenu2(Model model) {
		
		System.out.println("메소드 호출 확인 - registMenu() post");
		
		model.addAttribute("message", "신규 메뉴 등록2");
		
		return "mappingResult";
		
	}
	
	
	
	@RequestMapping("/menu/modify")
	public String modifyMenu(Model model) {
		
		System.out.println("메소드 호출 확인 - modifyMenu() get");
		
		model.addAttribute("message", "메뉴 수정");
		
		return "mappingResult";
		
	}
	
	@RequestMapping(value = "/menu/modify", method = RequestMethod.POST)
	public String modifyMenu2(Model model) {
		
		System.out.println("메소드 호출 확인 - modifyMenu() post");
		
		model.addAttribute("message", "메뉴  수정2");
		
		return "mappingResult";
		
	}
	
	
	// 요청 메소드별 전용 어노테이션 (4.3 버전 이상 ) 
	 /* 요청메소드            어노테이션
	 * POST         @PostMapping          C            BODY      행이추가(create)
	 * GET          @GetMapping           R            HEADER 사용    read
	 * PUT          @PutMapping           U            BODY      행이그대로(update) 
	 * DELETE       @DeleteMapping        D            BODY		  delete
	 * */
	
	
	
		/*
		 * @RequestMapping("/menu/delete") public String deleteMenu(Model model) {
		 * 
		 * System.out.println("메소드 호출 확인 - deleteMenu() get");
		 * 
		 * model.addAttribute("message", "메뉴 삭제");
		 * 
		 * return "mappingResult";
		 * 
		 * }
		 * 
		 * @RequestMapping(value = "/menu/delete", method = RequestMethod.POST) public
		 * String deleteMenu2(Model model) {
		 * 
		 * System.out.println("메소드 호출 확인 - deleteMenu() post");
		 * 
		 * model.addAttribute("message", "메뉴  삭제2");
		 * 
		 * return "mappingResult";
		 * 
		 * }
		 */
	
	@GetMapping("/menu/delete")
	//@RequestMapping(value = "/menu/delete", method = RequestMethod.GET)
	public String getDeleteMenu(Model model) {
		
		model.addAttribute("message", "GET 방식의 삭제용 핸들러 메소드 호출함...");

		return "mappingResult";
	}
	
	
	@PostMapping("/menu/delete")
	public String postDeleteMenu(Model model) {
		
		model.addAttribute("message", "POST 방식의 삭제용 핸들러 메소드 호출함...");
		
		return "mappingResult";
	}

}
