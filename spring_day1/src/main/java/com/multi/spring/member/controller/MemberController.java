package com.multi.spring.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.multi.spring.member.model.dao.MemberDAO;
import com.multi.spring.member.model.dto.MemberDTO;

@Controller
public class MemberController {
	/*
	 * @Autowired // 빈스캐닝을 통해 해당 인터페이스를 구현한 클래스(구현체)중 @component + 기능
	 * (@Service, @Repository) 로 등록되어있는 빈을 찾아서 자동으로 주입(DI) 해준다. MemberDAO memberDAO;
	 * // 필드 주입
	 */

	private final MemberDAO memberDAO;

	// @Autowired 명확해서 생략이 가능하다
	public MemberController(MemberDAO memberDAO) {
		// 필드를 직접접근 하지 않고 수정, 얻을 때 쓰는 setter/getter가 정의 되어있어야한다
		this.memberDAO = memberDAO;
	}

	@RequestMapping("/member")
	public void member() {

	}

	@RequestMapping("/insert") // @RequsetMapping handlerMapping에 등록됨
	public void insert(@ModelAttribute MemberDTO memberDTO) { // 커맨드 객체, command

		System.out.println(memberDTO);

		memberDAO.insert(memberDTO);

		// return "insert"; // view resolver에 의해 앞뒤로 경로를 확장자를 붙혀서 클라이언트에게 보이게 함

	}

	@RequestMapping("/login") // @RequsetMapping handlerMapping에 등록됨
	public String login(MemberDTO memberDTO) { // 커맨드 객체, command

		System.out.println(memberDTO);

		int result = 0; // 0 or 1 결과값 에따라
		if (result == 1) {
			return "ok";
		} else {
			return "redirect:member";

			// return "redirect:member" >> 메서드 추가 정의 필요하다;
			// return "redirect:WEB-INF/views/member.jsp";불가능

		}
	}
	// memberDAO.login(memberDTO);

	// return "login"; // view resolver에 의해 앞뒤로 경로를 확장자를 붙혀서 클라이언트에게 보이게 함

	@RequestMapping("/delete")
	// public void delete(@RequestParam String id) { // @RequestParam 생략하려면 매개변수의 명과
	// 파라미터의 명을 동일하게 줘야한다

	public void delete(@RequestParam("id") String writer) { // 지정해서 쓰기 가능
		System.out.println("받은 아이디는 " + writer);

	}

}
