package com.multi.section02.mapperscan.model.dao;

import java.util.List;

import com.multi.section02.mapperscan.model.dto.ProductDTO;

public interface ProductDAO {

	// 다오 인터페이스 명이 매퍼 xml의 네임스페이스와 일치
	// 메소드 명이 쿼리에 작성하는 아이디와 동일
	List<ProductDTO> selectProductList();

}
