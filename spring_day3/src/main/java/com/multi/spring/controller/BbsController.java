package com.multi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.multi.spring.model.dao.BbsDAO;
import com.multi.spring.model.dao.ReplyDAO;
import com.multi.spring.model.dto.BbsDTO;
import com.multi.spring.model.dto.ReplyDTO;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;

	@RequestMapping("list")
	public void list(Model model) throws Exception {
		// dao를 이용해서 여러개를 받아서 가지고 와주세요.
		List<BbsDTO> list = dao.list();
		System.out.println(list.size());
		// views/list.jsp까지 넘어가야 함.==>Model
		// model을 이용해서 검색결과인 list를 list.jsp까지 넘기자.!
		model.addAttribute("list", list);
	}

	@RequestMapping("one")
	public void one(BbsDTO dto, Model model) throws Exception {
		//one요청했을 때 views에 넣고 싶은 처리 내용을 다 써줘야한다.
		//bbs 상세페이지 + reply 댓글리스트 
		System.out.println(dto);
		BbsDTO bag = dao.one(dto);
		List<ReplyDTO> list = dao2.list(dto.getNo());
		System.out.println("list : " +list);
		model.addAttribute("bag", bag); //Object(큰) <-- BbsDTO2
		model.addAttribute("list", list);
	}
	
	@RequestMapping("jsonbbs")
	@ResponseBody
	public List<BbsDTO> jsonbbs() throws Exception {
		List<BbsDTO> list = dao.list();
		return list;
	}
	
	
	
	
	

}
