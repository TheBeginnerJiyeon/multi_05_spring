package com.multi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.aoptest.ASiteInterface;
import com.multi.spring.aoptest.BSiteInterface;

@Controller
public class AOPController {

	@Autowired
	ASiteInterface a;

	@Autowired
	BSiteInterface b;

	@RequestMapping("a.do")
	public void a() {
		// login()호출
		a.person();
		// logout()호출
	}

	@RequestMapping("b1.do")
	public void b1() {
		// login()호출
		b.search();
		// logout()호출
	}

	@RequestMapping("b2.do")
	public void b2() {
		// login()호출
		b.basket();
		// logout()호출
	}

	@RequestMapping("b3.do")
	public void b3() {
		// login()호출
		b.productOrder();
		// logout()호출
	}

}
