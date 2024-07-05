package com.multi.spring.member.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.multi.spring.member.model.dao.MemberDAO;
import com.multi.spring.member.model.dto.MemberDTO;

// @EnableAspectJAutoProxy 는 aspect-context에 있어서 안 적어도 됨
// <aop:aspectj-autoproxy/>

// @Transactional(rollbackFor = {Exception.class}) 메서드에 바로 적어도 됨

@Transactional(rollbackFor = { /* NullPointer */Exception.class })
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	private final MemberDAO memberDAO;

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	public MemberServiceImpl(MemberDAO memberDAO) {

		this.memberDAO = memberDAO;
	}

//	@Override
//	public void insertMember(MemberDTO memberDTO) throws Exception {
//		int result = memberDAO.insertMember(sqlSession, memberDTO);
//
//		if (result < 0) {
//
//			throw new Exception("회원 가입에 실패하셨습니다.");
//
//		}
//	}

	@Override
	public ArrayList<MemberDTO> selectMemberList() throws Exception {

		ArrayList<MemberDTO> list = (ArrayList<MemberDTO>) memberDAO.selectMemberList(sqlSession);

		if (list == null) {

			throw new Exception("회원 리스트 호출에 실패하셨습니다.");

		}

		return list;

	}

	@Override
	public void deleteMember(String id) throws Exception {
		int result = memberDAO.deleteMember(sqlSession, id);

		if (result < 0) {

			throw new Exception("회원 삭제에 실패하셨습니다.");

		}

	}

	@Transactional(rollbackFor = { Exception.class })
	@Override
	public void updateMember(MemberDTO memberDTO) throws Exception {
		int result = memberDAO.updateMember(sqlSession, memberDTO);
		/* memberDAO.insertMember(sqlSession, memberDTO); */ 
		// 일부로 에러 내기;

		/*
		 * Request processing failed; nested exception is
		 * org.springframework.dao.DataIntegrityViolationException: 
		 * 중복키 예외외에 다른 제약조건		 * 
		 * 위반상황에서도 발생 젤위에있다 에러메세지 발생 
		 * 
		 * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/dao/DataIntegrityViolationException.html 
		 * 위 경로로 가서 보면
		 * DataAccessException을 상속 받고 있고 들어가서 보면 
		 * 액세스 API(예: JDBC)에 대한 세부 정보를 모른 채 발생한 오류
		 * 종류를 찾아 처리할 수 있도록 하는 것을 목표로하여 sqlexception 을 
		 * 런타임으로 던져주고 있다 따라서 기본 롤백됨
		 */

		

		if (result < 0) {

			throw new Exception("회원  수정에 실패하셨습니다.");
			// 롤백안됨 - 롤백되게 하려면 
			// @Transactional(rollbackFor = Exception.class) 설정
			// throw new RuntimeException("회원정보 수정에 실패하였습니다"); 
			// 롤백됨

		}

	}

	@Override
	public MemberDTO selectMember(String id) throws Exception {
		MemberDTO memberDTO = memberDAO.selectMember(sqlSession, id);

		if (memberDTO == null) {

			throw new Exception("회원 리스트 호출에 실패하셨습니다.");

		}

		return memberDTO;
	}

//	@Override
//	public MemberDTO loginMember(MemberDTO memberDTO) throws Exception {
//
//		MemberDTO loginDto = memberDAO.loginMember(sqlSession, memberDTO);
//
//		if (loginDto == null) {
//
//			throw new Exception("로그인이 실패했습니다...");
//
//		}
//
//		return loginDto;
//
//	} // 암호화 처리 전

	@Override
	public void insertMember(MemberDTO memberDTO) throws Exception {

		System.out.println("암호화 전" + memberDTO.getPw());

		String encPw = bCryptPasswordEncoder.encode(memberDTO.getPw());
		System.out.println("암호화 후" + encPw);

		memberDTO.setPw(encPw);

		int result = memberDAO.insertMember(sqlSession, memberDTO);

		if (result < 0) {

			throw new Exception("회원 가입에 실패하셨습니다.");

		}
	}

	@Override
	public MemberDTO loginMember(MemberDTO memberDTO) throws Exception {

		MemberDTO loginDto = memberDAO.loginMember(sqlSession, memberDTO);

		if (loginDto == null) {

			throw new Exception("로그인이 실패했습니다... 아이디 자체가 없음");

		}

		if (!bCryptPasswordEncoder.matches(memberDTO.getPw(), loginDto.getPw())) {

			throw new Exception("암호 불일치....");

		}

		return loginDto;

	} // 암호화 처리 후

}
