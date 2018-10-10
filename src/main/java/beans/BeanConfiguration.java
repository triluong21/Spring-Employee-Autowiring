package beans;

import org.springframework.beans.factory.annotation.Autowire;
import	org.springframework.context.annotation.Bean;
import	org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public EmployeeDao employeeDao() {
		EmployeeDaoInMemoryImpl bean = new EmployeeDaoInMemoryImpl();
		return bean;
	}
	
	/*
	//Use this code with data loading from EmployeeDaoInMeroryImpl.java
	@Bean
	public EmployeeNewPayRate employeeNewPayRate() {
		EmployeeNewPayRateImpl bean = new EmployeeNewPayRateImpl();
		bean.setEmployeeDao(employeeDao());
		return bean;
	}
	*/
	
	/*
	//Use this code with data loading from beans.xml 
	@Bean
	public	EmployeeNewPayRate	employeeNewPayRate(){
		EmployeeNewPayRateImpl	bean	=	new	EmployeeNewPayRateImpl(employeeDao());
	
	return	bean;
	}
	*/
	
	//Use this code for bean autowiring 
	@Bean
	public	EmployeeDao	employeeDaoJdbc()	{
	EmployeeDaoJdbcImpl	bean	=	new	EmployeeDaoJdbcImpl();
	return	bean;
	}
	
	/*
	 // Autowire by Type
	@Bean(autowire=Autowire.BY_TYPE)
	public	EmployeeNewPayRate	employeeNewPayRate()	{
	EmployeeNewPayRateImpl	bean	=	new	EmployeeNewPayRateImpl(employeeDao());
	return	bean;
	}
	*/
	
	// Autowire by Name
	@Bean(autowire=Autowire.BY_NAME)
	public	EmployeeNewPayRate	employeeNewPayRate()	{
	EmployeeNewPayRateImpl	bean	=	new	EmployeeNewPayRateImpl(employeeDao());
	return	bean;
	}
	
}
