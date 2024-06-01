package com.multi.section01.connection.javaconfig.config;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.multi.section01.connection.javaconfig.ProductDAO;
import com.multi.section01.connection.javaconfig.ProductDTO;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	@Override
	public List<ProductDTO> selectProductList(SqlSessionTemplate sqlSession) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("productMapper.selectProductList");
	}

}
