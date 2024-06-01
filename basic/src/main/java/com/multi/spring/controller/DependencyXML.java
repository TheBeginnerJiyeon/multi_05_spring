package com.multi.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.multi.spring.model.xml.dto.Person;

/**
 * Servlet implementation class DependencyXML
 */
@WebServlet("/xmlDI")
public class DependencyXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DependencyXML() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//객체의존성 : 객체를 생성할때 new 를통해서 생성하는것 뿐만아니라, 메소드를 사용하든 어떤방법으로든 객체의 정보를 전달받는것
		
		/*
		 1. 생성자를 통한 의존성 주입
		Person p = new Person("유재석", "건물주");
		
		2. setter 를 통한 의존성 주입
		p.setName("남주혁");
		
		3. 다른 메소드를 통한 의존성 주입
		Connection con = getConnection();
		
		*/
		
		AbstractApplicationContext cntx = new GenericXmlApplicationContext("/di-xml-context.xml");
		
		Person p1 = (Person) cntx.getBean("person1");
		
		p1.getMyFood().eat("후라닥");
		
		
		Person p2 = (Person) cntx.getBean("person2");
		
		p2.getMyFood().eat("도미노");
		
		
		Person p3 = (Person) cntx.getBean("person1");
		
		p3.getMyFood().eat("후라닥2");
		
		
		Person p4 = (Person) cntx.getBean("person2");
		
		p4.getMyFood().eat("도미노2");
		
		System.out.println("p1"+p1);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.toString());
		System.out.println("p2"+p2);
		System.out.println("p3"+p3);
		System.out.println("p4"+p4);
		
		/*
		 * 한강에서 후라닥치킨을 먹는중 ~~ 
		 * 집에서 도미노피자를 먹는중 ~~~ 
		 * 한강에서 후라닥2치킨을 먹는중 ~~ 
		 * 집에서 도미노2피자를 먹는중 ~~~
		 * 투 스트링 있음
		 * p1영길~~~com.multi.spring.model.xml.dto.Chicken@9b41a4
		 * p2로운~~~com.multi.spring.model.xml.dto.Pizza@73662faa
		 * p3영길~~~com.multi.spring.model.xml.dto.Chicken@9b41a4
		 * p4로운~~~com.multi.spring.model.xml.dto.Pizza@73662faa
		 * 
		 * 1,3은 같은 사람이라서 같음. 싱글톤임
		 * p1==p3
		 * 2,4 같은 사람. 같은 객체
		 * 스프링에서 싱글톤 패턴으로 객체를 관리한다
		 */
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}