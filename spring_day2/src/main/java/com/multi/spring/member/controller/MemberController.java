package com.multi.spring.member.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.multi.spring.member.model.dto.MemberDTO;
import com.multi.spring.member.service.MemberService;

/* error-page
 * exception-type
 * ExceptionHandler
 * ControllerAdvice + ExceptionHandler
 * */

@SessionAttributes("loginUser")
// Model에 Attribute 추가할때 자동으로 설정된 키값을 세션에 등록 시키는 기능
@Controller
@RequestMapping("/member")
public class MemberController {

	private final MemberService memberService;

	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}

	
	
//	@ExceptionHandler(value = BadSqlGrammarException.class) 
//	// 쿼리를 붙이고 테스트
//	public ModelAndView controllerExceptionHandler1(Exception e) {
//
//		e.printStackTrace();
//		return new ModelAndView("common/errorPageServer").addObject("msg", e.getMessage());
//	}
//
//	@ExceptionHandler(value = Exception.class)
//	public ModelAndView controllerExceptionHandler2(Exception e) {
//
//		e.printStackTrace();
//		return new ModelAndView("common/errorPage").addObject("msg", e.getMessage());
//	}
	
	
	
	
	
	

	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@RequestMapping("/member")
	public void memberMain() {

	}

	@RequestMapping("/insert_form")
	public void memberInsert() {

	}

	@RequestMapping("/delete_form")
	public void membeDelete() {

	}

	@RequestMapping("/update_form")
	public void memberUpdate() {

	}

	@RequestMapping("/one_form")
	public void memberOne() {

	}

	@RequestMapping("/list")
	public void memberList() {

	}

	@RequestMapping("/enrollForm")
	public String enrollForm() {
		return "member/enroll_form";
	}

	@PostMapping("/insert")
	public String insertMember(MemberDTO memberDTO, HttpSession session) throws Exception {

		memberService.insertMember(memberDTO);

		System.out.println("insert ==> " + memberDTO);
		session.setAttribute("msg", "회원가입성공");
		return "redirect:/member/member";

	}

	@GetMapping("/delete")
	public String deleteMember(String id, HttpSession session) throws Exception {

		memberService.deleteMember(id);

		session.setAttribute("msg", "회원삭제 성공");
		return "redirect:/member/member";

	}

	@PostMapping("/update")
	public String updateMember(MemberDTO memberDTO, HttpSession session) throws Exception {

		memberService.updateMember(memberDTO);

		System.out.println("update ==> " + memberDTO);
		session.setAttribute("msg", "회원 수정 성공");
		return "redirect:/member/member";

	}

	@GetMapping("/list")
	public void selectMemberList(HttpSession session, Model model) throws Exception {

		ArrayList<MemberDTO> list = memberService.selectMemberList();

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

		session.setAttribute("msg", "회원 리스트 호출 성공");

		model.addAttribute("list", list);

	}

	@GetMapping("/one")
	public void selectMember(HttpSession session, String id, Model model) throws Exception {

		MemberDTO memberDTO = memberService.selectMember(id);

		System.out.println(memberDTO);

		session.setAttribute("msg", "회원 호출 성공");

		model.addAttribute("dto", memberDTO);

	}

//	@PostMapping("/login")
//	public String loginMember(MemberDTO memberDTO, HttpSession httpSession) {
//
//		System.out.println("login ==> " + memberDTO);
//
//		try {
//			MemberDTO dto = memberService.loginMember(memberDTO);
//			httpSession.setAttribute("loginUser", dto);
//
//			return "redirect:/";
//		} catch (Exception e) {
//
//			e.printStackTrace();
//			return "common/errorPage";
//
//		}
//
//	}
//
//	@RequestMapping("/logout")
//	public String logout(HttpSession session) {
//		session.invalidate();
//		return "redirect:/";
//	}

	@PostMapping("/login")
	public String loginMember(MemberDTO memberDTO, Model model) {

		System.out.println("login ==> " + memberDTO);

		try {
			MemberDTO dto = memberService.loginMember(memberDTO);
			model.addAttribute("loginUser", dto);
			return "redirect:/";
		} catch (Exception e) {

			e.printStackTrace();
			return "common/errorPage";

		}

	}

	@RequestMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete(); // 현재 SessionAttributes 에 의해 저장된 오브젝트를 제거
		return "redirect:/";
	}

}
