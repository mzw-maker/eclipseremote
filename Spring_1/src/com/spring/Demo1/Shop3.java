package com.spring.Demo1;

import javax.annotation.Resource;

public class Shop3 {
	
	@Resource(name="custor1")
	Custor1 custor1;
	Custor2 custor2;
	
	


	public void save() {
		custor1.getName();
		System.out.println("ÄãºÃÀ²À²À²");
		
	}
	
	

}
