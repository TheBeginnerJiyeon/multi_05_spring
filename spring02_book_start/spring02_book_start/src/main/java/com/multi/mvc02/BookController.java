package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
	
	@Autowired
	BookDAO dao;
	
	//요청하나당 함수하나!!!
	
}
