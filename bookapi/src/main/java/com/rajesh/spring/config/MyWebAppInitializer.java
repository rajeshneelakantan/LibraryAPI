package com.rajesh.spring.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



 
public class MyWebAppInitializer extends  AbstractAnnotationConfigDispatcherServletInitializer {
//AbstractDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub;
		 System.out.println("Inside webappinitialize App Configr");
		return new Class[] { AppConfig.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		 System.out.println("Inside webappinitialize Web Configr");
		return new Class[] {WebConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		 System.out.println("Inside webappinitialize SevletMapping");
		return new String[] {"/"};
	}
	
	/*  @Override
	  protected WebApplicationContext createRootApplicationContext() {
		  System.out.println("Inside webappinitialize App Configr");
	    AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
	    applicationContext.register(AppConfig.class);
	    return applicationContext;
	  }

	  @Override
	  protected WebApplicationContext createServletApplicationContext() {
		  System.out.println("Inside webappinitialize Web Configr");
	    AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
	    applicationContext.register(WebConfig.class);
	    return applicationContext;
	  }*/
	}

