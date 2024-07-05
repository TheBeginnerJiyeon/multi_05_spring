package com.multi.spring.page.service;

import java.util.List;

import com.multi.spring.page.model.dto.BbsDTO;
import com.multi.spring.page.model.dto.PageDTO;

public interface BbsService {

	List<BbsDTO> selectAll(PageDTO pageDto) throws Exception;

	int selectCount() throws Exception;

}
