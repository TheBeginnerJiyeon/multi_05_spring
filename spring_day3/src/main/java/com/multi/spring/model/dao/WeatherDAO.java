package com.multi.spring.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.spring.model.dto.WeatherDTO;

@Repository
public class WeatherDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	

	public int insertWeather(WeatherDTO dto) throws Exception{
		
		
		return sqlSessionTemplate.insert("weather.insert", dto);
		
	}

}
