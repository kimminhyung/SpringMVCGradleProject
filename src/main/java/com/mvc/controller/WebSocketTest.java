package com.mvc.controller;

import java.security.MessageDigest;
import java.util.Base64;

import javax.websocket.OnClose;

import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ServerEndpoint("/webSocket")
public class WebSocketTest {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
		
	@RequestMapping(value="/webSocketView")
	public String webSocketView(){
		return "webSocketView";
	}

	@OnOpen
	public void onConnect(Session session){
		log.debug("#### WebSocket Connected :" + session.isOpen());
		session.getOpenSessions();
		
	}
	@OnMessage
	public void onMessage(String msg, Session session){
		log.debug("############## WebSocket Msg :"+ msg+", getProtocolVersion :" + session.getProtocolVersion());
		try{
			session.getBasicRemote().sendText(msg);
		
			
			
		}catch(Throwable e){
			log.error(e.getMessage());
		}
	}
	@OnError
	public void onError(Throwable e, Session session){
		log.debug("############## WebSocket Error :"+ e.toString() );
	}
	@OnClose
	public void onClose(Session session){
		log.debug("#### WebSocket Closed :" + session.isOpen());
	}
}
