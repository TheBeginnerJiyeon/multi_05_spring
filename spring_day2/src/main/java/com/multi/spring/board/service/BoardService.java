package com.multi.spring.board.service;

import java.util.ArrayList;

import com.multi.spring.board.model.dto.BoardDTO;



public interface BoardService {

	void insertBoard(BoardDTO boardDTO) throws Exception;

	ArrayList<BoardDTO> selectBoardList() throws Exception;

	void deleteBoard(int no) throws Exception;



	void updateBoard(BoardDTO boardDTO) throws Exception;

	BoardDTO selectBoard(int no) throws Exception;

	

	

}
