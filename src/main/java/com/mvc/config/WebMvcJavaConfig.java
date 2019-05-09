package com.mvc.config;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan({"com.mvc.config", "com.mvc.beans", "com.mvc.controller", "com.mvc.aop"})
//<context:component-scan base-package="com.mvc.controller" />
// <mvc:annotation-config /> //web mvc annotation 을 사용할수 있게 해준다.
// java 어노테이션기반 web mvc 클래스를 읽어들이겠다는 뜻
@EnableWebMvc

public class WebMvcJavaConfig extends WebMvcConfigurerAdapter{
	
	/**
	 * PropertySourcesPlaceholderConfigurer를 컨텍스트에 Bean으로 등록함으로써
	 * 지정된 프라퍼티 값을 Value 어노테이션을 통해 읽음 동시에 주입함이 가능하도록 한다.
	 * 추후 Value 어노테이션은 모든 ComponentScan 범위의 스테레오 타입에  적용 가능하다.
	 * 
	 * JavaConetxtConfig에 Bean 생성/등록으로도 가능하고 
	 * Xml Context Config로도 가능하다 (
	 * @return
	 */
//	@Bean
//	public PropertySourcesPlaceholderConfigurer propertySourcePlaceholderConfigurer(){
//		PropertySourcesPlaceholderConfigurer prop = 
//				new PropertySourcesPlaceholderConfigurer();		
//		
//		Resource location = new ClassPathResource("/META-INF/properties/jdbc.prop");
//		prop.setLocation(location);
//		prop.setIgnoreUnresolvablePlaceholders(true);		
//		
//		return prop;
//	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry resRegistry){
			
		resRegistry.addResourceHandler("/res/image/**").addResourceLocations("/WEB-INF/res/image/");
		resRegistry.addResourceHandler("/js/**").addResourceLocations("/js/");
		resRegistry.addResourceHandler("/bootstrap/**").addResourceLocations("/bootstrap/");
		super.addResourceHandlers(resRegistry);	
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry){
		viewResolverRegistry.jsp("/WEB-INF/views/jsp/", ".jsp");
	}
	
	// 한글 안깨지게 UTF-8 HttpMessageConverter를 bean 으로 등록하고 
	@Bean
	public HttpMessageConverter<String> responseBodyConverter(){
		StringHttpMessageConverter converter = new StringHttpMessageConverter();
		converter.setSupportedMediaTypes(Arrays.asList(new MediaType("text","plain",Charset.forName("UTF-8")  )));
		return converter;
	}
	
	// 한글 utf-8 HttpMessageConverter 를 사용 환경에 등록한다.
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		super.configureMessageConverters(converters);		
		converters.add(responseBodyConverter());
	}
	//초기 화면로딩 welcome page 지정
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addViewController("/").setViewName("AiHome");
	}
	
	

}




















