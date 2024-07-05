package com.multi.spring.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.spring.model.dto.BbsDTO;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate sqlsession;
	
	public int insert(BbsDTO dto) {
		int result = sqlsession.insert("bbs.create", dto);
		return result;
	}
	
	
	public int update(BbsDTO dto) {
		int result = sqlsession.update("bbs.update", dto);
		return result;

	}
	

	public int delete(BbsDTO dto) {
		int result = sqlsession.delete("bbs.delete", dto);
		return result;

	}
	// 리스트 전체 보기
	public List<BbsDTO> list() throws Exception {
		List<BbsDTO> list = sqlsession.selectList("bbs.list");
		return list;
	}

	// 리스트 중에서 선택한 물건 하나 보기
	public BbsDTO one(BbsDTO dto) throws Exception {
		// 3.SQL문 결정/생성
		BbsDTO dto2 = sqlsession.selectOne("bbs.one", dto);
		return dto2;
	}
}
