package com.multi.spring.board.model.dto;

import java.util.Date;

public class BoardDTO {
	//데이터타입 변수명; --> ram에 공간을 만들게 된다.
	//만들어지는 위치가 변수를 사용할 수 있는 영역을 결정.
	//변수가 만들어지는 것을 포함하는 {괄호}안에서 사용할 수 있음.
	//클래스 바로 아래에 만들어지는 변수는
	//클래스 전체영역에서 사용될 수 있는 변수
	//전역변수(global변수) ==> 자동초기화
	private int no; //null
	private int categoryCode;
	private String title;
	private String content;
	private String writer;
	private int count;
	private Date createDate;
	private Date modifiedDate;
	private String status;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MemberDTO [no=" + no + ", categoryCode=" + categoryCode + ", title=" + title + ", content=" + content
				+ ", writer=" + writer + ", count=" + count + ", createDate=" + createDate + ", modifiedDate="
				+ modifiedDate + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
