package springfinal.config;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc 	// Tương đương với <mvc:annotation-driven />
@Configuration 	//indicates to Spring that this is a configuration class that will @Configuration
				//provide beans to the Spring application context
@ComponentScan("springfinal")
@EnableJpaRepositories("springfinal.repositories")
@EnableSpringDataWebSupport
@EnableTransactionManagement
public class WebConfig   implements WebMvcConfigurer{ //extends WebMvcConfigurerAdapter
	@Bean
	public ViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver bean = new InternalResourceViewResolver();
	    bean.setViewClass(JstlView.class);
	    bean.setPrefix("/WEB-INF/views/");
	    bean.setSuffix(".jsp");
	    return bean;
	}
	
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
//		datasource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		datasource.setDriverClassName("org.postgresql.Driver");
		
//	    datasource.setUrl("jdbc:mysql://localhost:3306/orm?useSSL=false&useUnicode=true&characterEncoding=utf8");
		datasource.setUrl("jdbc:postgresql://127.0.0.1:5432/springmvc");
		datasource.setUsername("phuocnv4");
		datasource.setPassword("BB234MLtmP(#");
		return datasource;
	}
	
	private final Properties hibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
//		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.SQLServer2012Dialect");
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");

		return hibernateProperties;
	}
	
	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean ();
        entityManagerFactory.setDataSource(dataSource());
        entityManagerFactory.setPackagesToScan("springfinal.entities");
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        entityManagerFactory.setJpaVendorAdapter(vendorAdapter);
        entityManagerFactory.setJpaProperties(hibernateProperties());
        return entityManagerFactory;
    }
	
	 @Bean
	    @Qualifier(value = "entityManager")
	    public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
	        return entityManagerFactory.createEntityManager();
	    }
	 
	 @Bean
	    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
	        JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(entityManagerFactory);
	        return transactionManager;
	    }
	 
//	 @Override
//	    public void addFormatters(FormatterRegistry registry) {
//	        registry.addFormatter(new UserFormat(applicationContext.getBean(UserServiceImpl2.class)));
//	    }
	 
	 @Bean
	    public MessageSource messageSource() {
	        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	        messageSource.setBasenames("message");
	        messageSource.setDefaultEncoding("UTF-8");
	        return messageSource;
	    }
	 
	 @Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
			// TODO Auto-generated method stub
//			WebMvcConfigurer.super.addResourceHandlers(registry);
			registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		}
	 
	 
}
