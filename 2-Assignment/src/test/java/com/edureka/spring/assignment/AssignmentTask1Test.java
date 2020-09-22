package com.edureka.spring.assignment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssignmentTask1Test {

	@Test
	public void annotationsBasedWiring() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-assignment.xml");
		Company company= applicationContext.getBean(Company.class);
		Employee employee = applicationContext.getBean(Employee.class);
		
		Assertions.assertThat(company).isNotNull();
		Assertions.assertThat(employee).isNotNull();
		Assertions.assertThat(company.getEmployee()).isNotNull();
	}
}
