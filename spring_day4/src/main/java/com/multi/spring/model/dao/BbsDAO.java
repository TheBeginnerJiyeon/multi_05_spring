package com.multi.spring.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.multi.spring.model.dto.BbsDTO;

@Component
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BbsDTO vo) {
		return my.insert("bbs.create", vo);
	}
}
