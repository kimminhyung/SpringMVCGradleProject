<%@ include file="/WEB-INF/views/jsp/header/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<HEAD>
	<META LANG="ko">
	<script>
	/**
	CONNECTING	0	연결이 수립되지 않은 상태입니다.
	OPEN	1	연결이 수립되어 데이터가 오고갈 수 있는 상태입니다.
	CLOSING	2	연결이 닫히는 중 입니다.
	CLOSED	3	연결이 종료되었거나, 연결에 실패한 경우입니다.
	*/
	
		var webSocket = new WebSocket("ws://localhost:9090/webSocket");
		$(document).ready( 
			function (){	
				webSocket.onopen = function(){
					$("#conState").text("연결되었습니다.");
				}
				webSocket.onclose = function(){
					$("#conState").text("연결 끊어짐.");
				}
				webSocket.onmessage = function(message){
					$("#conState").text("메세지 수신됨 :" + message.data);
				}
				webSocket.onerror = function(message){
					$("#conState").text("오류발생 :" + message);
				}
				
				$("#send").click(function(){
					if(webSocket.readyState == 1){
						webSocket.send("산들바람 안녕?");
						$("#conState").text("메시지 전송함 ");
					}
					else{
						$("#conState").text("연결이 끊어져서 전송할수 없습니다.재연결 수립함("+ webSocket.readyState+")");					
						webSocket = new WebSocket("ws://localhost:9090/webSocket");
						webSocket.onopen = function(){
							$("#conState").text("연결되었습니다.");
						}
						webSocket.onclose = function(){
							$("#conState").text("연결 끊어짐.");
						}
						webSocket.onmessage = function(message){
							$("#conState").text("메세지 수신됨 :" + message.data);
						}
						webSocket.onerror = function(message){
							$("#conState").text("오류발생 :" + message);
						}
						if( webSocket.readyState == 1){
							webSocket.send("a");
						}else{
							$("#conState").text("아직 미연결 ...{" + webSocket.readyState+"}");
						}
					}
					
				});
				$("#close").click(function(){
					webSocket.close();
				});				
		});
		
	</script>
</HEAD>
<BODY>
	<P>WebSocketView Page</P>
	<P><input type="button" id="send" value="웹소켓메세지 전송">
	<P><input type="button" id="close" value="웹소켓 끊기">
	<p id="conState">연결상태</p>
</BODY>

