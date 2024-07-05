package com.multi.spring.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.spring.member.model.dto.MemberDTO;

@Repository
public class MemberDAO {

	public int insertMember(SqlSessionTemplate sqlSessionTemplate, MemberDTO memberDTO) {

		int result = sqlSessionTemplate.insert("insertMember", memberDTO);

		return result;
	}

	public void login(MemberDTO memberDTO) {
		// TODO Auto-generated method stub

	}

	public List<MemberDTO> selectMemberList(SqlSessionTemplate sqlSession) {

		List<MemberDTO> list = sqlSession.selectList("selectList", sqlSession);

		list = (ArrayList<MemberDTO>) list;

		return list;
	}

	public int deleteMember(SqlSessionTemplate sqlSession, String id) {
		int result = sqlSession.delete("deleteMember", id);

		return result;
	}

	public int updateMember(SqlSessionTemplate sqlSession, MemberDTO memberDTO) {
		int result = sqlSession.update("updateMember", memberDTO);

		return result;
	}

	public MemberDTO selectMember(SqlSessionTemplate sqlSession, String id) {
		MemberDTO memberDTO = sqlSession.selectOne("selectMember", id);

		return memberDTO;
	}

	public MemberDTO loginMember(SqlSessionTemplate sqlSession, MemberDTO memberDTO) {

		MemberDTO loginDto = sqlSession.selectOne("loginMember", memberDTO);

		return loginDto;

	}

}
