package com.multi.spring.book.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.book.model.dto.BookDTO;
import com.multi.spring.book.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	private final BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}


	@RequestMapping("/book")
	public void book() {

	}

	@GetMapping("/delete")
	public String deleteBook(int id, HttpSession session) throws Exception {

		bookService.deleteBook(id);

		session.setAttribute("msg", "책 삭제 성공");
		return "redirect:/book/book";

	}

	@RequestMapping("/one")
	public void bookOne(BookDTO bookDTO1, HttpSession session, Model model) {

		BookDTO bookDTO = null;
		try {
			bookDTO = bookService.selectBook(bookDTO1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(bookDTO);

		session.setAttribute("msg", "게시글 호출 성공");

		model.addAttribute("dto", bookDTO);

	}

	@GetMapping("/list")
	public void list(Model model, HttpSession session) {

		ArrayList<BookDTO> list = null;
		try {
			list = bookService.selectBookList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

		session.setAttribute("msg", "책 리스트 호출 성공");

		model.addAttribute("list", list);

	}

//	@RequestMapping("/one")
//	public void bookOne() {
//		
//	}
//	
//	@GetMapping("/one")
//	public void selectBook(Model model, HttpSession session) {
//		
//		BookDTO bookDTO=null;
//		try {
//			bookDTO = bookService.selectBook(bookDTO);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(bookDTO);
//		
//		session.setAttribute("msg", "책 호출 성공");
//		
//		model.addAttribute("dto", bookDTO);
//		
//	}
//	
//	@RequestMapping("/insert")
//	public void bookInsert() {
//		
//	}
//	
	@PostMapping("/insert")
	public void insertBook(Model model, HttpSession session, BookDTO bookDTO) {

		int result = 0;
		try {
			result = (int) bookService.insertBook(bookDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(bookDTO);

		session.setAttribute("msg", "책 호출 성공");

		model.addAttribute("dto", bookDTO);

	}

}