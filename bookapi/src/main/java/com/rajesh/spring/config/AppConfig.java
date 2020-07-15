package com.rajesh.spring.config;


import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import static org.hibernate.cfg.Environment.*;
/*import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//@ComponentScans(value = { @ComponentScan("com.rajesh.spring.dao"),
//@ComponentScan("com.rajesh.spring.service") })
@Configuration
@PropertySource({"classpath:db.properties"})
@EnableTransactionManagement

@ComponentScan({
    "com.rajesh.spring"
})
@EnableJpaRepositories(basePackages = "com.rajesh.spring.dao")
public class AppConfig {
	
	@Autowired  //automatically creates object for env
	   private Environment env;

    public AppConfig() {
        super();
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
    	System.out.println("Inide APPconfig-PersistenceExceptionTranslationPostProcessor 1");
        return new PersistenceExceptionTranslationPostProcessor();
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    	System.out.println("Inide APPconfig-entityManagerFactory 2 ");
        final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPackagesToScan(new String[] {
            "com.rajesh.spring.model"
        });

        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
        entityManagerFactoryBean.setJpaProperties(additionalProperties());
        System.out.println("Inide APPconfig- before returning entityManagerFactoryBean- end 7");
        return entityManagerFactoryBean;
    }
    @Bean
    public DataSource dataSource() {
    	System.out.println("Inide APPconfig- datasource astart -3");
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("mysql.driver"));
        dataSource.setUrl(env.getProperty("mysql.url"));
        dataSource.setUsername(env.getProperty("mysql.user"));
        dataSource.setPassword(env.getProperty("mysql.password"));
        System.out.println("Inide APPconfig- before returning datasource- end 4 ");
        return dataSource;
    }
    final Properties additionalProperties() {
    	System.out.println("Inide APPconfig-additionalProperties 5");
        final Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
       // hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
        //hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", env.getProperty("hibernate.cache.use_second_level_cache"));
        //hibernateProperties.setProperty("hibernate.cache.use_query_cache", env.getProperty("hibernate.cache.use_query_cache"));
        // hibernateProperties.setProperty("hibernate.globally_quoted_identifiers", "true");
        System.out.println("Inide APPconfig-before returning  additola peroperties hibernateproperties - end 6");
        return hibernateProperties;
    }

   

    @Bean
    public PlatformTransactionManager transactionManager(final EntityManagerFactory emf) {
    	System.out.println("Inide APPconfig-transactionManager start ");
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
      
        System.out.println("Inide APPconfig- before returing transactionManage ");
        return transactionManager;
    }

   
}
*/
@ComponentScans(value = { @ComponentScan("com.rajesh.spring.dao"),
@ComponentScan("com.rajesh.spring.service") })
@Configuration
@PropertySource({"classpath:db.properties"})
@EnableTransactionManagement
public class AppConfig{
@Autowired  //automatically creates object for env
private Environment env;

@Bean
public LocalSessionFactoryBean getSessionFactory() {
	 System.out.println("Inside Appconfig SessionFactory");
   LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
   Properties props = new Properties();
   // Setting JDBC properties
   props.put(DRIVER, env.getProperty("mysql.driver"));
   props.put(URL, env.getProperty("mysql.url"));
   props.put(USER, env.getProperty("mysql.user"));
   props.put(PASS, env.getProperty("mysql.password"));

   // Setting Hibernate properties
   props.put(SHOW_SQL, env.getProperty("hibernate.show_sql")); // to view or query
   System.out.println("To check show sql property is working");
   props.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));   //to create the table automatically

   // Setting C3P0 properties
   props.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
   props.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
   props.put(C3P0_ACQUIRE_INCREMENT, 
         env.getProperty("hibernate.c3p0.acquire_increment"));
   props.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
   props.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));

   factoryBean.setHibernateProperties(props);
   factoryBean.setPackagesToScan("com.rajesh.spring.model");  //hobernate will create tables for us
   System.out.println("Inside Appconfig SessionFactory- end");
   return factoryBean;}


@Bean
public HibernateTransactionManager getTransactionManager() {
	 System.out.println("Inside Appconfig HibernateTransaction Manager");
   HibernateTransactionManager transactionManager = new HibernateTransactionManager();
   transactionManager.setSessionFactory(getSessionFactory().getObject());
   System.out.println("Inside Appconfig HibernateTransaction Manager - end");
   return transactionManager;
}
}