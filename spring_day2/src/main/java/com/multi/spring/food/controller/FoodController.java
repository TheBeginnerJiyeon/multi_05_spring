package com.multi.spring.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.multi.spring.food.model.dto.foodDTO;

@Controller
@RequestMapping("/food")
public class FoodController {

	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@RequestMapping("/like")
	public void like() {

	}

	@RequestMapping("/dislike")
	public void dislike() {

	}

	@RequestMapping("/food")
	public void foodMain() {

	}

	@GetMapping("/choice")
	public String choice(@RequestParam("like") String like, @RequestParam("dislike") String dislike) {

		String page = "";
		if (like.equals("라면")) {

			page = "redirect:like";

		} else if (dislike.equals("커피")) {
			page = "redirect:dislike";
		} else if (like.equals("아무거나")) {
			page = "redirect:food";
		}

		return page;

	}
	
//	@GetMapping("/choice")
//	public String choice(foodDTO foodDTO) {
//		
//		System.out.println(foodDTO);
//		String page = "";
//		
//		String like = foodDTO.getLike();
//		String dislike = foodDTO.getDislike();
//		
//		if (like.equals("라면")) {
//			
//			page = "redirect:like";
//			
//		} else if (dislike.equals("커피")) {
//			page = "redirect:dislike";
//		} else if (like.equals("아무거나")) {
//			page = "redirect:food";
//		}
//		
//		return page;
//		
//	}

}
