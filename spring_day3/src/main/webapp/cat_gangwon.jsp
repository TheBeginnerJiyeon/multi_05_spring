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
#b2 {
	display: none;
}
</style>


<script type="text/javascript">


	$(function() {
		
		var catsData = [];
		
		
		$('#b1').click(function() {
			$.ajax({
				url:'https://api.odcloud.kr/api/15093766/v1/uddi:bd3117d8-d36e-495e-ae9a-d4dafdd7c445?page=1&perPage=1000',
				dataType : 'json',
				headers : {
					
					Authorization : 'Infuser chNg8jx96krRfOCTvGcO2PvBKnrCrH0Qm6/JmV1TOw/Yu1T0x3jy0fHM8SOcZFnJIxdc7oqyM03PVmMA9UFOsA=='
				},
					success: function(array){
					console.log(array);
					
					var list = [];
					
					$(array.data).each(function(i,cat){
						
						list.push({							
							"관리기관명": cat["관리기관명"],							
							데이터기준일자: cat.데이터기준일자,
							모색: cat.모색,							
							방사일자: cat.방사일자,
							방사장소: cat.방사장소,							
							성별: cat.성별,							
							전화번호: cat.전화번호,							
							중성화수술일자: cat.중성화수술일자,							
							체중: cat["체중(kg)"],
                            추정나이: cat["추정나이(세)"],						
							포획일자: cat.포획일자,							
							포획장소: cat.포획장소
							
						});						
						
					});		
					
					 var resultHtml = "<table border='1'><tr><th>관리기관명</th><th>데이터기준일자</th><th>모색</th><th>방사일자</th><th>방사장소</th><th>성별</th><th>전화번호</th><th>중성화수술일자</th><th>체중</th><th>추정나이</th><th>포획일자</th><th>포획장소</th></tr>";
                     $(list).each(function(i, list) {
                         resultHtml += "<tr><td>" + list.관리기관명 + "</td><td>" + list.데이터기준일자 + "</td><td>" + list.모색 + "</td><td>" + list.방사일자 + "</td><td>" + list.방사장소 + "</td><td>" + list.성별 + "</td><td>" + list.전화번호 + "</td><td>" + list.중성화수술일자 + "</td><td>" + list.체중 + "</td><td>" + list.추정나이 + "</td><td>" + list.포획일자 + "</td><td>" + list.포획장소 + "</td></tr>";
                     });
					
					resultHtml+="</table>";
					
					$('#result').html(resultHtml);
					
					if(list.length>0){
						$('#b2').show();
						catsData=list;
					}
					
					
				}
				
			});
		});
		$('#b2').click(function() {
			$.ajax({
				url:'gw_cat_insert',
				method: 'POST',
				contentType: 'application/json',
				data: JSON.stringify(catsData),
				success: function(x){
					console.log(x);
					$('#result').append("<br><br>데이터 베이스에 삽입 성공!!");
					$('#result').append("<br><br>");
					
					let img="  <img src = 'https://github.githubassets.com/images/icons/emoji/unicode/1f408-2b1b.png?v8'>";
					
					$('#result').append(img);
					
							
				}
				
			})
		})
	})
					
</script>
</head>
<body>
	<button id="b1">강원도 중성화 현황 알아오기!</button>
	<hr>
	<button id="b2">강원도 고양이 데이터베이스에 저장하기!</button>
	<hr>
	<div id="result"></div>
</body>
</html>
