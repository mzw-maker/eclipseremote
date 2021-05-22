package com.spring.Demo1;

import org.springframework.stereotype.Component;

@Component("Shop")
public class Shop2 {
	
	Custor1 custor1;
	Custor2 custor2;
	
	
	public Custor1 getCustor1() {
		return custor1;
	}

	public void setCustor1(Custor1 custor1) {
		this.custor1 = custor1;
	}

	public Custor2 getCustor2() {
		return custor2;
	}

	public void setCustor2(Custor2 custor2) {
		this.custor2 = custor2;
	}


	public void save() {
		
		System.out.println("ÄãºÃÀ²À²À²");
		
	}
	
	

}
