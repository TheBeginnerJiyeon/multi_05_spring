package com.multi.spring.board.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.spring.board.model.dto.BoardDTO;

@Repository
public class BoardDAO {

	public int insertBoard(SqlSessionTemplate sqlSessionTemplate, BoardDTO boardDTO) {

		int result = sqlSessionTemplate.insert("insertBoard", boardDTO);

		return result;
	}


	public List<BoardDTO> selectBoardList(SqlSessionTemplate sqlSession) {

		List<BoardDTO> list = sqlSession.selectList("selectBoardList", sqlSession);

		list = (ArrayList<BoardDTO>) list;

		return list;
	}

	public int deleteBoard(SqlSessionTemplate sqlSession, int no) {
		int result = sqlSession.delete("deleteBoard", no);

		return result;
	}

	public int updateBoard(SqlSessionTemplate sqlSession, BoardDTO boardDTO) {
		int result = sqlSession.update("updateBoard", boardDTO);

		return result;
	}

	public BoardDTO selectBoard(SqlSessionTemplate sqlSession, int no) {
		BoardDTO boardDTO = sqlSession.selectOne("selectBoard", no);

		

		return boardDTO;
	}

}
