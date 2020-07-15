
	
	


package com.rajesh.spring.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 

@Configuration 
@EnableWebMvc
@ComponentScan(basePackages = { "com.rajesh.spring.controler" })
public class WebConfig implements  WebMvcConfigurer{
//extends WebMvcConfigurerAdapter {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		System.out.println("Inside WebConfig method cors mapping");
		registry.addMapping("/**");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("Inside WebConfig method Veiwresolver method");
		InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class); //jpa ku use panadhu
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	}
	
