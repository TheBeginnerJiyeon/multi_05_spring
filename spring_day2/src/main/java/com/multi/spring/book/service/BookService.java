package com.multi.spring.book.service;

import java.util.ArrayList;

import com.multi.spring.book.model.dto.BookDTO;



public interface BookService {

	ArrayList<BookDTO> selectBookList() throws Exception;

	BookDTO selectBook(BookDTO bookDTO1) throws Exception;

	int insertBook(BookDTO bookDTO) throws Exception;

	void deleteBook(int id) throws Exception;


	

	

	

}
