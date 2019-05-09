package com.mvc.beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CustomApplicationListener implements ApplicationListener<ContextRefreshedEvent>{

	public void onApplicationEvent(ContextRefreshedEvent event){
		
		System.out.println("########### Context Refreshed Event Occured ...!!! "); 
								
	}
	
}
