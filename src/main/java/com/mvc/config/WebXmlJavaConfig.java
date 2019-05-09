//package com.mvc.config;
//
//import javax.servlet.Filter;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
//import org.springframework.util.Log4jConfigurer;
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//import org.springframework.web.util.Log4jConfigListener;
//
//public class WebXmlJavaConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
//
//	@Override
//	protected Class<?>[] getRootConfigClasses(){
//		return new Class<?>[]{ RootXmlConfig.class };
//	}
//	
//	@Override
//	protected Class<?>[] getServletConfigClasses(){
//		return new Class<?>[]{ WebMvcJavaConfig.class };
//	}
//	@Override
//	protected String[] getServletMappings(){
//		return new String[] { "/" };
//	}
//	@Override
//	protected Filter[] getServletFilters(){
//		CharacterEncodingFilter characterEncodingFilter = 
//				new CharacterEncodingFilter();
//		characterEncodingFilter.setEncoding("UTF-8");
//		characterEncodingFilter.setForceEncoding(true);
//		return new Filter[] { characterEncodingFilter };
//	}
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException{
//		super.onStartup(servletContext);
//		servletContext.setInitParameter("defaultHtmlEscape", "true");		
//		
//		// log4j.xml 환경파일 경로 강제 지정
//		servletContext.setInitParameter("log4jConfigLocation", "classpath:/META-INF/log4j.xml");		
//		servletContext.addListener(Log4jConfigListener.class);
//		
//	}		
//	
//}
//
//
//
//
//
