package com.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mvc.beans.CustomApplicationListener;

@Configuration
public class BeanContextJavaConfig {

	/**
	 * Application 이벤트 커스텀리스터 Bean을 IOC 컨테이너에 주입
	 * @return
	 */
	@Bean
	public CustomApplicationListener customApplicationListener(){
		CustomApplicationListener applicationListener = new CustomApplicationListener();
		return applicationListener;
	}
}
