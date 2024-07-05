package com.multi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.model.dto.ComputerDTO;

@Controller
public class ComputerController {

	@RequestMapping("computer")
	public void computer(ComputerDTO vo, Model model) {
	//computer?com=맥&price=2000&mouse=로지텍&price2=1000
	//public void computer(String com, int pirce, String mouse, int price2)
		System.out.println(vo);
		int total = vo.getPrice() + vo.getPrice2();
		model.addAttribute("vo", vo);
		model.addAttribute("total", total);
		//total = 3000
	}
}
