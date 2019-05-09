package com.mvc.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.mvc")
@PropertySources({
	@PropertySource("classpath:/META-INF/properties/jdbc.prop") ,
	@PropertySource("classpath:/META-INF/properties/myprop.prop")
})
public class RootContextJavaConfig {

	public Logger log = LoggerFactory.getLogger(RootContextJavaConfig.class);
	
	// 프라퍼티 xml  파일도 Value로 주입할수 있다. (그냥 의미상 코딩)
	@Value("classpath:/META-INF/propreties/jdbc.prop")	
	private Resource jdbcPropResource;
	// 프라퍼티 xml  파일도 Value로 주입할수 있다. (그냥 의미상 코딩)ㄴ
	@Value("classpath:/META-INF/properties/myprop.prop")
	private Resource myPropResource;
	
	// 프라퍼티값 Value 어노테이션으로 주입
	@Value("${jdbc.url}")
	private String jdbcUrl;
	@Value("${jdbc.user}")
	private String jdbcUser;
	@Value("${jdbc.password}")
	private String jdbcPwd;
	@Value("${jdbc.driverClassName}")
	private String driverClass;
	@Value("${jdbc.maxActive}")
	private int maxActive;
	
	@Value("${myprop.myname}")
	private String myname;
	
	/**
	 * 프라퍼티소스 로케이션 설정 (PropertySource 혹은 PropertySources) 어노테이션으로 
	 * Location 은 지정해줄수 있고, 직접 PropertySourcesPlaceholderConfgurer에서 
	 * setLocations로 지정할수도 있다. (Resource객제로 등록 xml, file, url, ByteArray, InputStream..)
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcePlaceholderConfigurer(){
		PropertySourcesPlaceholderConfigurer prop = new PropertySourcesPlaceholderConfigurer();
//		Resource jdbcLocation = new ClassPathResource("/META-INF/properties/jdbc.prop");
//		Resource myLocation = new FileSystemResource("C:\\1.STUDY\\WEB\\SpringMVC-Gradle\\src\\main\\resources\\META-INF\\properties\\myprop.prop");
//		prop.setLocations(jdbcLocation, myLocation);		
		
		return prop;
	}
	/**
	 * 데이터소스 설정
	 * @return
	 */
	@Bean
	public DataSource dataSource(){
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl(jdbcUrl);
		ds.setUsername(jdbcUser);
		ds.setPassword(jdbcPwd);
		ds.setDriverClassName(driverClass);
		ds.setMaxActive(maxActive);		
		return ds;
	}

}



