package com.multi.spring.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.spring.model.dto.MapDTO;

@Repository
public class MapDAO {

	@Autowired
	SqlSessionTemplate my;
	
	//전체리스트 가지고 오는 기능 
	public List<MapDTO> all() {
		return my.selectList("mymap.all");
	}
	
	//location에 맞는 정보를 가지고 오는 기능 
	public MapDTO one(String location) {
		return my.selectOne("mymap.one", location);
	}
}
