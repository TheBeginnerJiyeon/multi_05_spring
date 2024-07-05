package com.multi.spring.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.spring.model.dto.ChartDTO;

@Repository
public class ChartDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public List<ChartDTO> list() {
		return my.selectList("mychart.all");
	}
}
