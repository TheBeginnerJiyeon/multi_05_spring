package com.multi.spring.member.service;

import java.util.ArrayList;
import java.util.List;

import com.multi.spring.member.model.dto.MemberDTO;


public interface MemberService {

	void insertMember(MemberDTO memberDTO) throws Exception;

	ArrayList<MemberDTO> selectMemberList() throws Exception;

	void deleteMember(String id) throws Exception;



	void updateMember(MemberDTO memberDTO) throws Exception;

	MemberDTO selectMember(String id) throws Exception;

	MemberDTO loginMember(MemberDTO memberDTO) throws Exception;

	

	

}
