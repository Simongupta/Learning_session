package com.edureka.spring.assignment;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class JSR_Annotations {
	List<String> cars;
	boolean initCalled = false;
	boolean destroyCalled = false;
	
	@PostConstruct
	public void populate() {
		cars = new ArrayList<String>();
		cars.add("FORD");
		cars.add("TATA");
		initCalled = true;
	}
	
	public void m1() {
		
	}
	
	@PreDestroy
	public void clear() {
		if(initCalled) {
			destroyCalled=true;
		}
		cars.clear();
		
	}
}
