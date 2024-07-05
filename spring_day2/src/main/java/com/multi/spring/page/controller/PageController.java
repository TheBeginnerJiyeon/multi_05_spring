package com.multi.spring.page.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.multi.spring.page.model.dto.BbsDTO;
import com.multi.spring.page.model.dto.PageDTO;
import com.multi.spring.page.service.BbsService;

@Controller
@RequestMapping("/page")
public class PageController {

	private final BbsService bbsService;

	public PageController(BbsService bbsService) {
		super();
		this.bbsService = bbsService;
	}

	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@GetMapping("/bbsMain")
	public void fileMain() {

	}

	@GetMapping("bbsAll")
	public void selectAll(/* @RequestParam(name = "page") int page, */ PageDTO pageDto, Model model) {

		/* System.out.println("page: " + page); */

		System.out.println("page: " + pageDto.getPage());

		pageDto.setStartEnd(pageDto.getPage());



		try {
			List<BbsDTO> list = bbsService.selectAll(pageDto);
			
			int count = bbsService.selectCount();
			int pages = count / 10 + 1;

			model.addAttribute("list", list);
			model.addAttribute("pages", pages);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@GetMapping("bbsAll2")
	public void selectAll2(PageDTO pageDto, Model model) {
		
		
		System.out.println("page: " + pageDto.getPage());
		
		pageDto.setStartEnd(pageDto.getPage());
		
		
		
		try {
			List<BbsDTO> list = bbsService.selectAll(pageDto);
			
			int count = bbsService.selectCount();
			int pages = count / 10 + 1;
			
			model.addAttribute("count",count);
			model.addAttribute("list", list);
			model.addAttribute("pages", pages);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@GetMapping("bbsList2")
	public void selectBbsList2(PageDTO pageDto, Model model) {
		
		
		System.out.println("page: " + pageDto.getPage());
		
		pageDto.setStartEnd(pageDto.getPage());
		
		
		
		try {
			List<BbsDTO> list = bbsService.selectAll(pageDto);
			
			
			model.addAttribute("list", list);
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
