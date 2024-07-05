package com.multi.spring.file.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.file.model.dao.FileDAO;
import com.multi.spring.movie.model.dto.MovieDTO;


@Service("fileService")
public class FileServiceImpl implements FileService{
	
	@Autowired
	private FileDAO fileDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	

	@Override
	public void insertMovie(MovieDTO movieDTO) throws Exception {
		
		int result = fileDAO.insertMovie(sqlSessionTemplate, movieDTO);
		
		if (result<0) {
			
			throw new Exception("영화 등록 실패!!");
		}
		
		
	}
	
	
	

}
