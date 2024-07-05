package com.multi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multi.spring.model.dao.WeatherDAO;
import com.multi.spring.model.dto.WeatherDTO;


@RestController
public class WeatherController {

	@Autowired
	WeatherDAO weatherDAO;

	@PostMapping("/weather_insert")
	public ResponseEntity<String> dbInsert(@RequestBody WeatherDTO dto) {

		System.out.println("WeatherDTO: " + dto);

		int result;
		ResponseEntity<String> result2=null;
		
		try {
			result = weatherDAO.insertWeather(dto);
			
			

			if (result > 0) {

				result2 = ResponseEntity.ok("날씨 삽입 성공!!");
			}

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result2;
		
		
	}

}
