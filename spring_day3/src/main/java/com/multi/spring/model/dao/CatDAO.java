package com.multi.spring.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.spring.model.dto.CatDTO;

@Repository
public class CatDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public int insertList(List<CatDTO> list) throws Exception {
		
		int result=0;
		
		for (int i = 0; i < list.size(); i++) {
			
			sqlSessionTemplate.insert("cat.insert",list.get(i));
			result+=1;
			
		}
		
		return result;

	}

}
