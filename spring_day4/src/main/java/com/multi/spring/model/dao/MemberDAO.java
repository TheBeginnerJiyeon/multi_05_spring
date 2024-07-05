package com.multi.spring.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.spring.model.dto.MemberDTO;



@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate mybatis;

	public int insert(MemberDTO vo) {
		return mybatis.insert("member.create", vo);
	}
}
