//package com.mvc.config;
//
//import javax.servlet.Filter;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
//
//public class WebXmlXmlConfig extends AbstractDispatcherServletInitializer{
//
//	@Override
//	protected WebApplicationContext createServletApplicationContext() {
//		// TODO Auto-generated method stub
//		XmlWebApplicationContext rootContext = 
//				new XmlWebApplicationContext();
//		rootContext.setConfigLocation("classpath:/META-INF/spring-root-context.xml");
//		return rootContext;
//	}
//	@Override
//	protected WebApplicationContext createRootApplicationContext() {
//		// TODO Auto-generated method stub
//		XmlWebApplicationContext webContext = 
//			 new XmlWebApplicationContext();
//		webContext.setConfigLocation("classpath:/META-INF/spring-web-mvc.xml");
//		return webContext;
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		// TODO Auto-generated method stub
//		String[] urlPattern = new String[]{"/"}; 
//		return urlPattern;
//	}
//
//	@Override
//	protected Filter[] getServletFilters(){
//		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//		characterEncodingFilter.setEncoding("UTF-8");
//		return new Filter[]{characterEncodingFilter};
//	}
//	
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// TODO Auto-generated method stub
//		super.onStartup(servletContext);
//		servletContext.setInitParameter("defaultHtmlEscape", "true");
//	}
//
//	
//}
