package com.multi.spring.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.spring.model.dto.ReplyDTO;

@Repository
public class ReplyDAO {

	@Autowired
	SqlSessionTemplate sqlsession;//100
	
	
	public int insert(ReplyDTO dto) {
		return sqlsession.insert("reply.create", dto);
	}
	
	public List<ReplyDTO> list(int id) {
		return sqlsession.selectList("reply.list", id);
	}
}
