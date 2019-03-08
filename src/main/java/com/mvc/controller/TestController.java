package com.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
	@GetMapping(path={"/hi/{userId}", "/smith/{userId}"} )
//	public String hellow(@PathVariable int userId){
	public String hellow(@PathVariable("useId") int userId) {
		return "hellow22222 안녕하세요333 , userId{" + userId + "}";
	}
	
}
