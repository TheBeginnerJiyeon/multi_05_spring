package com.multi.spring.model.dto;

import java.util.Date;

public class CatDTO {
	
	private int no;
	
	private String 관리기관명;
	private Date 데이터기준일자;
	private String 모색;
	private String 방사일자;
	private String 방사장소;
	private String 성별;
	private String 전화번호;
	private Date 중성화수술일자;
	private Float 체중;
	private int 추정나이;
	private Date 포획일자;
	private String 포획장소;
	
	
	
	public String get관리기관명() {
		return 관리기관명;
	}
	public void set관리기관명(String 관리기관명) {
		this.관리기관명 = 관리기관명;
	}
	public Date get데이터기준일자() {
		return 데이터기준일자;
	}
	public void set데이터기준일자(Date 데이터기준일자) {
		this.데이터기준일자 = 데이터기준일자;
	}
	public String get모색() {
		return 모색;
	}
	public void set모색(String 모색) {
		this.모색 = 모색;
	}
	public String get방사일자() {
		return 방사일자;
	}
	public void set방사일자(String 방사일자) {
		this.방사일자 = 방사일자;
	}
	public String get방사장소() {
		return 방사장소;
	}
	public void set방사장소(String 방사장소) {
		this.방사장소 = 방사장소;
	}
	public String get성별() {
		return 성별;
	}
	public void set성별(String 성별) {
		this.성별 = 성별;
	}
	public String get전화번호() {
		return 전화번호;
	}
	public void set전화번호(String 전화번호) {
		this.전화번호 = 전화번호;
	}
	public Date get중성화수술일자() {
		return 중성화수술일자;
	}
	public void set중성화수술일자(Date 중성화수술일자) {
		this.중성화수술일자 = 중성화수술일자;
	}
	public float get체중() {
		return 체중;
	}
	public void set체중(Float 체중) {
		this.체중 = 체중;
	}
	public int get추정나이() {
		return 추정나이;
	}
	public void set추정나이(int 추정나이) {
		this.추정나이 = 추정나이;
	}
	public Date get포획일자() {
		return 포획일자;
	}
	public void set포획일자(Date 포획일자) {
		this.포획일자 = 포획일자;
	}
	public String get포획장소() {
		return 포획장소;
	}
	public void set포획장소(String 포획장소) {
		this.포획장소 = 포획장소;
	}
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "CatDTO [no=" + no + ", 관리기관명=" + 관리기관명 + ", 데이터기준일자=" + 데이터기준일자 + ", 모색=" + 모색 + ", 방사일자=" + 방사일자
				+ ", 방사장소=" + 방사장소 + ", 성별=" + 성별 + ", 전화번호=" + 전화번호 + ", 중성화수술일자=" + 중성화수술일자 + ", 체중=" + 체중 + ", 추정나이="
				+ 추정나이 + ", 포획일자=" + 포획일자 + ", 포획장소=" + 포획장소 + "]";
	}
	
	
	

	
	
	
	
	

}
