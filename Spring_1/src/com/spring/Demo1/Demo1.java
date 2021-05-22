package com.spring.Demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
	
	/*
	 * 注解方式：只需要在类最上面加上注解 ID
	 */
	@Test
	public void test(){
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shop shop = (Shop) application.getBean("shop");
		
		shop.save();
	}
	
	/*
	 * 注解方式添加属性
	 */
	@Test
	public void test1(){
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shop2 shop = (Shop2) application.getBean("Shop2");
		
		Custor1 custor1 = shop.getCustor1();
		custor1.getName();
	}
	
	
	@Test
	public void test2() {
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shop3 shop = (Shop3) application.getBean("Shop3");
		
		shop.save();
		
		
	}
	
	
	
	

}
