package com.multi.spring.board.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.board.model.dao.BoardDAO;
import com.multi.spring.board.model.dto.BoardDTO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	private final BoardDAO boardDAO;

	@Autowired
	private SqlSessionTemplate sqlSession;

	public BoardServiceImpl(BoardDAO boardDAO) {

		this.boardDAO = boardDAO;
	}

	@Override
	public void insertBoard(BoardDTO boardDTO) throws Exception {
		int result = boardDAO.insertBoard(sqlSession, boardDTO);

		if (result < 0) {

			throw new Exception("회원 가입에 실패하셨습니다.");

		}
	}

	@Override
	public ArrayList<BoardDTO> selectBoardList() throws Exception {

		ArrayList<BoardDTO> list = (ArrayList<BoardDTO>) boardDAO.selectBoardList(sqlSession);

		if (list == null) {

			throw new Exception("게시글 리스트 호출에 실패하셨습니다.");

		}

		return list;

	}

	@Override
	public void deleteBoard(int no) throws Exception {
		int result = boardDAO.deleteBoard(sqlSession, no);

		if (result < 0) {

			throw new Exception("게시글 삭제에 실패하셨습니다.");

		}

	}

	@Override
	public void updateBoard(BoardDTO boardDTO) throws Exception {
		int result = boardDAO.updateBoard(sqlSession, boardDTO);

		if (result < 0) {

			throw new Exception("회원  수정에 실패하셨습니다.");

		}

	}

	@Override
	public BoardDTO selectBoard(int no) throws Exception {
		BoardDTO boardDTO = boardDAO.selectBoard(sqlSession, no);

		if (boardDTO == null) {

			throw new Exception("회원 리스트 호출에 실패하셨습니다.");

		}

		return boardDTO;
	}

	

}
