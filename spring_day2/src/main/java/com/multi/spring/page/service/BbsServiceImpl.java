package com.multi.spring.page.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.page.model.dao.BbsDAO;
import com.multi.spring.page.model.dto.BbsDTO;
import com.multi.spring.page.model.dto.PageDTO;

@Service("bbsService")
public class BbsServiceImpl implements BbsService {

	private final BbsDAO bbsDAO;

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public BbsServiceImpl(BbsDAO bbsDAO) {
		super();
		this.bbsDAO = bbsDAO;
	}

	@Override
	public List<BbsDTO> selectAll(PageDTO pageDto) throws Exception {

		List<BbsDTO> list = bbsDAO.selectAll(sqlSessionTemplate, pageDto);

		return list;

	}

	@Override
	public int selectCount() throws Exception {
		
		int count = bbsDAO.selectCount(sqlSessionTemplate);
		
		return count;
	}

}
