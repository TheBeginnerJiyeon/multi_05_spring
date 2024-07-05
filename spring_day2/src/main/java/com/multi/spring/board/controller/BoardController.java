
package com.multi.spring.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.board.model.dto.BoardDTO;
import com.multi.spring.board.service.BoardService;



@Controller
@RequestMapping("/board")
public class BoardController {

	private final BoardService boardService;

	public BoardController(BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@RequestMapping("/bbs")
	public void bbsMain() {

	}

	@RequestMapping("/bbs_insert_form")
	public void memberInsert() {

	}

	@RequestMapping("/bbs_delete_form")
	public void membeDelete() {

	}

	@RequestMapping("/bbs_update_form")
	public void memberUpdate() {

	}

	@RequestMapping("/bbs_one_form")
	public void memberOne() {

	}

	@RequestMapping("/bbs_list")
	public void memberList() {

	}

	@PostMapping("/insert")
	public String insertBoard(BoardDTO boardDTO, HttpSession session) throws Exception {

		boardService.insertBoard(boardDTO);

		System.out.println("insert ==> " + boardDTO);
		session.setAttribute("msg", "게시글 작성 성공");
		return "redirect:/board/bbs";

	}

	@GetMapping("/delete")
	public String deleteBoard(int no, HttpSession session) throws Exception {

		boardService.deleteBoard(no);

		session.setAttribute("msg", "게시글 삭제 성공");
		return "redirect:/board/bbs";

	}

	@PostMapping("/update")
	public String updateBoard(BoardDTO boardDTO, HttpSession session) throws Exception {

		boardService.updateBoard(boardDTO);

		System.out.println("update ==> " + boardDTO);
		session.setAttribute("msg", "게시글 수정 성공");
		return "redirect:/board/bbs";

	}

	@GetMapping("/bbs_list")
	public void selectBoardList(HttpSession session, Model model) throws Exception {

		ArrayList<BoardDTO> list = boardService.selectBoardList();

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

		session.setAttribute("msg", "게시글 리스트 호출 성공");

		model.addAttribute("list", list);

	}

	@GetMapping("/bbs_one")
	public void selectBoard(HttpSession session, int no, Model model) throws Exception {

		BoardDTO boardDTO = boardService.selectBoard(no);

		System.out.println(boardDTO);

		session.setAttribute("msg", "게시글 호출 성공");

		model.addAttribute("bag", boardDTO);
		
		

	}

}
