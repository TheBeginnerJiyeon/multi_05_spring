package com.multi.spring.file.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.spring.movie.model.dto.MovieDTO;

@Repository
public class FileDAO {

	public int insertMovie(SqlSessionTemplate sqlSessionTemplate, MovieDTO movieDTO) {
		
		int result = sqlSessionTemplate.insert("movieMapper.insertMovie",movieDTO);
		
		return result;
		
		
	}
	
	
	
	
	

}
