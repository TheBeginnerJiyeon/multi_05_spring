package com.multi.spring.book.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.board.model.dto.BoardDTO;
import com.multi.spring.book.model.dao.BookDAO;
import com.multi.spring.book.model.dto.BookDTO;

@Service("bookService")
public class BookServiceImpl implements BookService {

	private final BookDAO bookDAO;

	@Autowired
	private SqlSessionTemplate sqlSession;

	public BookServiceImpl(BookDAO bookDAO) {

		this.bookDAO = bookDAO;
	}

	

	
//
//	@Override
//	public BookDTO selectBook(BookDTO bookDTO) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int insertBook(BookDTO bookDTO) throws Exception {
//		// TODO Auto-generated method stub
//		return 0;
//	}





	@Override
	public ArrayList<BookDTO> selectBookList() throws Exception {
		
		ArrayList<BookDTO> list = (ArrayList<BookDTO>) bookDAO.selectBookList(sqlSession);

		if (list == null) {

			throw new Exception("책 리스트 호출에 실패하셨습니다.");

		}

		return list;

		
	}




	@Override
	public BookDTO selectBook(BookDTO bookDTO1) throws Exception {
		BookDTO bookDTO = bookDAO.selectBook(sqlSession, bookDTO1);
		
		return bookDTO;
	}




	@Override
	public int insertBook(BookDTO bookDTO) throws Exception {
		int result = bookDAO.insertBook(sqlSession, bookDTO);

		if (result < 0) {

			throw new Exception("책 등록에 실패하셨습니다.");

		}
		return result;
	}




	@Override
	public void deleteBook(int id) throws Exception {
		int result = bookDAO.deleteBook(sqlSession, id);

		if (result < 0) {

			throw new Exception("책 삭제에 실패하셨습니다.");

		}
		
		
	}

	

}
