package com.multi.spring.model.dto;

public class WeatherDTO {
	
	private int no;
	private int lat;
	private int lon;
	private String weather;
	private int windSpeed; 
	private int temp;
	private int feelsTemp;
	private int clouds;
	public int getLat() {
		return lat;
	}
	
	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public void setLat(int lat) {
		this.lat = lat;
	}
	public int getLon() {
		return lon;
	}
	public void setLon(int lon) {
		this.lon = lon;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getFeelsTemp() {
		return feelsTemp;
	}
	public void setFeelsTemp(int feelsTemp) {
		this.feelsTemp = feelsTemp;
	}
	public int getClouds() {
		return clouds;
	}
	public void setClouds(int clouds) {
		this.clouds = clouds;
	}


	@Override
	public String toString() {
		return "WeatherDTO [no=" + no + ", lat=" + lat + ", lon=" + lon + ", weather=" + weather + ", windSpeed="
				+ windSpeed + ", temp=" + temp + ", feelsTemp=" + feelsTemp + ", clouds=" + clouds + "]";
	}
	
	
	
	
	
	

}
