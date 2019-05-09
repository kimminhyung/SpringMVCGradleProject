package com.mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 서블릿컨텍스트 사용
 * @author 민형
 *
 */
public class MyServlet extends HttpServlet{	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		ServletContext sContext = config.getServletContext();
		sContext.setAttribute("newKey",  "newValue" );
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		ServletContext servletContext = getServletContext();		
	}
}
