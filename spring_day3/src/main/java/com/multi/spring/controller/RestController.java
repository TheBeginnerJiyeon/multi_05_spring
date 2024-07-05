package com.multi.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.multi.spring.model.dao.ChartDAO;
import com.multi.spring.model.dao.MapDAO;
import com.multi.spring.model.dto.BbsDTO;
import com.multi.spring.model.dto.ChartDTO;
import com.multi.spring.model.dto.MapDTO;

@Controller
public class RestController {

	@Autowired
	MapDAO mapDAO;
	
	@Autowired
	ChartDAO chartDAO;
	
	@RequestMapping("string")
	@ResponseBody // controller에서 data를 리턴할 때! 
	public String name() {
		return "winner";
	}

	@RequestMapping("json1")
	@ResponseBody // dto --> json==> views를 만들필요가 없음.  확인 return 되는 데이터를 json 으로 만들어서 요청하는곳으로 반환 
	public BbsDTO json1() {
		BbsDTO dto = new BbsDTO();
		dto.setNo(1);
		dto.setTitle("win");
		dto.setContent("안녕 뽀로로!!");
		dto.setWriter("apple");
		return dto; //json 형태로 리턴됨
	}

	@RequestMapping("json2")
	@ResponseBody //list<dto> --> array[json,json]
	public ArrayList<BbsDTO> json2() {
		ArrayList<BbsDTO> list = new ArrayList<BbsDTO>();
		for (int i = 0; i < 5; i++) {
			BbsDTO dto = new BbsDTO();
			dto.setNo(i);
			dto.setTitle("win" + i);
			dto.setContent("win!! win!!" + i);
			dto.setWriter("apple");

			list.add(dto);
		}//for
		return list;
	}
	
	@RequestMapping("map1")
	@ResponseBody
	public MapDTO kakaoMap() {
		MapDTO map = new MapDTO();
		map.setLat(37.5116828);
		map.setLon(127.059151);
		return map;
	}

	@RequestMapping("map2") //one검색 
	@ResponseBody
	public MapDTO one(String location) {
		System.out.println(location);
		MapDTO mp = mapDAO.one(location);
		return mp;
	}
	
	@RequestMapping("map3") //all 검색 
	@ResponseBody
	public List<MapDTO> all() {
		System.out.println(" 타는지 ");
		System.out.println(mapDAO.all());
		return mapDAO.all();
	}
	
	@RequestMapping("chart1") //all 검색 
	@ResponseBody
	public List<ChartDTO> chart1() {
		return chartDAO.list();
	}
	
	
	
	
	
	
}
