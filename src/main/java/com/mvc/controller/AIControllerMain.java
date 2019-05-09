package com.mvc.controller;


import java.sql.Connection;


import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@PropertySource("classpath:/META-INF/properties/jdbc.prop")
public class AIControllerMain {
	
	public Logger log = LoggerFactory.getLogger(AIControllerMain.class);	
	
	@Autowired
	public DataSource dataSource;
	
	// Properties Value Read..
	@Value("${jdbc.url}")
	public String jdbcUrl;
	@Value("${jdbc.user}")
	private String jdbcUser;
	@Value("${jdbc.password}")
	private String jdbcPwd;
	@Value("${myprop.myname}")
	private String myname;
	
	@GetMapping(path={"/innerContents"})
	public String showInnerContents(){
		String viewName = "/code/codeRegist";
		Connection con = null;
		try{
			con = dataSource.getConnection();
			log.info("####### 디비연결 성공 con :"+ con.toString());		
			log.info("####### myprop.myname :"+ myname);
			
			log.info(String.format("####### JDBC 프라퍼티 VALUE url[%s], id[%s], password[%s])", 
									   jdbcUrl, jdbcUser,jdbcPwd) );
			
		
		}catch(Exception e){
			log.error("디비 연결실패 :"+ e.toString());
		}finally{
			try{
				if( con != null){					
					con.close();
					log.info("DB 연결 해제됨");
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	
		
		return viewName;
	}
}
