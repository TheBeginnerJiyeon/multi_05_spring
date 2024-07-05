package com.multi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.model.dao.ReplyDAO;
import com.multi.spring.model.dto.ReplyDTO;

@Controller //ReplyController replyController = new ReplyController();
public class ReplyController {

	@Autowired
	ReplyDAO replyDAO;
	
	@RequestMapping("insert4") //ajax호출!
	//ajax호출은 views/insert4.jsp를 만들지 않으면 ajax호출 404에러가 뜬다. 
	public void insert(ReplyDTO replyDTO, Model model) {
		System.out.println(replyDTO);
		int result = replyDAO.insert(replyDTO);
		System.out.println("reply insert 결과 >>" + result);

		model.addAttribute("result", result);
	}
}
