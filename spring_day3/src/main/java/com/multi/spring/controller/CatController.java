package com.multi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multi.spring.model.dao.CatDAO;
import com.multi.spring.model.dao.WeatherDAO;
import com.multi.spring.model.dto.CatDTO;
import com.multi.spring.model.dto.WeatherDTO;

@RestController
public class CatController {

	@Autowired
	CatDAO catDAO;

	@PostMapping("/gw_cat_insert")
	public ResponseEntity<String> dbInsert(@RequestBody List<CatDTO> list) {

		System.out.println("CatList: " + list);

		int result;
		ResponseEntity<String> result2 = null;

		try {
			result = catDAO.insertList(list);

			if (result > 0) {

				result2 = ResponseEntity.ok("고양이 리스트 삽입 성공!!");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result2;

	}

}
