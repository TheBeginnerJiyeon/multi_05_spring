package com.multi.spring.page.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.spring.page.model.dto.BbsDTO;
import com.multi.spring.page.model.dto.PageDTO;

@Repository
public class BbsDAO {

	public List<BbsDTO> selectAll(SqlSessionTemplate sqlSessionTemplate, PageDTO pageDto) {
		
		List<BbsDTO> list  =sqlSessionTemplate.selectList("bbsMapper.selectAll",pageDto);
		
		return list;
		
		
	}

	public int selectCount(SqlSessionTemplate sqlSessionTemplate) {
		
		int count=sqlSessionTemplate.selectOne("bbsMapper.selectCount");
		
		return count;
		
	}

}
