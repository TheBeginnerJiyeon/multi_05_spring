package com.multi.spring.book.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.spring.board.model.dto.BoardDTO;
import com.multi.spring.book.model.dto.BookDTO;

@Repository
public class BookDAO {

//	public int insertBook(SqlSessionTemplate sqlSessionTemplate, BookDTO bookDTO) {
//
//		int result = sqlSessionTemplate.insert("insertBook", bookDTO);
//
//		return result;
//	}

	public List<BookDTO> selectBookList(SqlSessionTemplate sqlSession) {

		List<BookDTO> list = sqlSession.selectList("selectBookList", sqlSession);

		list = (ArrayList<BookDTO>) list;

		return list;
	}

	public BookDTO selectBook(SqlSessionTemplate sqlSession, BookDTO bookDTO1) {

		BookDTO bookDTO = sqlSession.selectOne("selectBook", bookDTO1);
		return bookDTO;

	}

	public int insertBook(SqlSessionTemplate sqlSession, BookDTO bookDTO) {
		int result = sqlSession.insert("insertBook", bookDTO);

		return result;
	}

	public int deleteBook(SqlSessionTemplate sqlSession, int id) {
		int result = sqlSession.delete("deleteBook", id);

		return result;
	}

//	public BookDTO selectBoard(SqlSessionTemplate sqlSession, int id) {
//		BookDTO bookDTO = sqlSession.selectOne("selectBook", id);
//
//		
//
//		return bookDTO;
//	}

}
