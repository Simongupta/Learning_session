package com.edureka.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.assertj.core.api.Assertions;
import com.edureka.spring.assignment.LifeCycleBean;


public class AssignmentTest {
	
	@Test
	public void shouldDCallInitDestroy() {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	LifeCycleBean lifeCycleBean =  applicationContext.getBean(LifeCycleBean.class);
	Assertions.assertThat(lifeCycleBean).isNotNull();
	Assertions.assertThat(lifeCycleBean.isInitialized()).isTrue();
	}

}
