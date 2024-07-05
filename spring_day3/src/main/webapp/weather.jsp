<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Insert title here</title>
<meta
	content='width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no'
	name='viewport'>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.min.js"></script>

<style>
	#b2{
		display: none;
	
	}


</style>	
	
	
<script type="text/javascript">
lat = '';
lon = '';
if (navigator.geolocation) {
	  navigator.geolocation.getCurrentPosition(showPosition);
	} else {
	  console.log("Geolocation is not supported by this browser.");
	}

	function showPosition(position) {
	  console.log("Latitude: " + position.coords.latitude);
	  lat = position.coords.latitude;
	  console.log("Longitude: " + position.coords.longitude);
	  lon =position.coords.longitude;
	}

	$(function() {
		
		var weatherData = {};
		
		
		$('#b1').click(function() {
			$.ajax({
				url:'https://api.openweathermap.org/data/2.8/onecall?lat='+ lat +'&lon='+lon+'&exclude=hourly,daily,minutely&appid=db829ead36ad5599e41574163a3b1549',
				dataType : 'json',
				success: function(x){
					console.log(x);
					$('#result').html("현재 위도 경도 "+x.lat+ " , " + x.lon+"<br>"+
							"날씨"+x.current.weather[0].description+"<br>"+
							"풍속"+x.current.wind_speed+"<br>"+
							"기온"+x.current.temp+"<br>"+
							"체감 온도"+x.current.feels_like+"<br>"+
							"구름"+x.current.clouds+"<br>")
							
							
					weatherData.lat = x.lat;
					weatherData.lon = x.lon;
					weatherData.weather = x.current.weather[0].description;
					weatherData.windSpeed = x.current.wind_speed;
					weatherData.temp = x.current.temp;
					weatherData.feelsTemp = x.current.feels_like;
					weatherData.clouds = x.current.clouds;
					
							
							
					
					let img="";
							
					
					if(x.current.weather[0].description.includes("clouds")){
						img = "<img src = 'resources/img/cloud.jpg'>";
						
					}else if(x.current.weather[0].description.includes("rain")){
						img = "<img src = 'resources/img/rain.jpg'>";
						
					}else{
						img = "<img src = 'resources/img/sun.jpg'>";
						
					}
					
					$('#result').append(img)
					$('#result').append("<br><br>")
					
					let img2="";
					
					if(x.current.temp>300){
						
						img2 = "<img src = 'resources/img/hot.jpg'>";
					}else if(x.current.temp>200){
						
						img2 = "<img src = 'resources/img/medium.jpg'>";
					}else{
						img2 = "<img src = 'resources/img/cold.jpg'>";
						
					} 	
					
					
					$('#result').append(img2)	
					
					
					if(Object.keys(weatherData.length>0)){
						
						$('#b2').show();
						
					}
					
							
				}
				
			})
		})
		$('#b2').click(function() {
			$.ajax({
				url:'weather_insert',
				method: 'POST',
				contentType: 'application/json',
				data: JSON.stringify(weatherData),
				success: function(x){
					console.log(x);
					$('#result').append("<br><br>데이터 베이스에 삽입 성공!!");
					$('#result').append("<br><br>");
					
					let img="  <img src = 'https://github.githubassets.com/images/icons/emoji/unicode/1f986.png'>";
					
					$('#result').append(img);
					
							
				}
				
			})
		})
	})
					
</script>
</head>
<body>
	<button id="b1">날씨 알아오기!</button>
	<hr>
	<button id="b2">날씨 데이터베이스에 저장하기!</button>
	<hr>
	<div id="result"></div>
</body>
</html> 