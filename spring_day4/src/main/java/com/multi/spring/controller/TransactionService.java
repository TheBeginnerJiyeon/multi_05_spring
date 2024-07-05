package com.multi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.multi.spring.model.dao.BbsDAO;
import com.multi.spring.model.dao.MemberDAO;
import com.multi.spring.model.dto.BbsDTO;
import com.multi.spring.model.dto.MemberDTO;


@EnableAspectJAutoProxy
@Transactional(rollbackFor = {Exception.class})
@Service
public class TransactionService {

	@Autowired
	MemberDAO dao;
	
	@Autowired
	BbsDAO dao2;
	
	
	public int tran(MemberDTO  vo, BbsDTO vo2) throws Exception {
		System.out.println("내가 호출되긴 한단다..!!!");
		int result = 1;
		dao.insert(vo);
		if (0 == dao2.insert(vo2)) {
			System.out.println("에러발생!!!");
			result = 0;
		}
		return result;
	}
}
