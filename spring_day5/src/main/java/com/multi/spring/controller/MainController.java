package com.multi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class MainController {


	
	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}
	
	
	@RequestMapping("/myShopChatBot")
	public void memberMain() {
	
	}
	
	
	@RequestMapping("/realChat")
	public void insertForm() {
	
	}
}