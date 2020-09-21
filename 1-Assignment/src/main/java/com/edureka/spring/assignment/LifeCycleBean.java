package com.edureka.spring.assignment;

import lombok.Data;

@Data
public class LifeCycleBean {
	boolean initialized, destroyed;
	
		public void init() {
			initialized = true;
		
		}
	
		public void m2() {
			//
		}
	
		public void destroy() {
			destroyed=true;
		
		}
}
