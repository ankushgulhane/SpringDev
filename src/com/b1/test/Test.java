package com.b1.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.b1.beans.Student;

public class Test implements ApplicationListener{
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/b1/cfg/spring-conf.xml");
		
		
		Student s=context.getBean("student", Student.class);
		
		System.out.println(s);
		
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		System.out.println("context system is inatialize"+arg0.getClass());
		System.out.println("context system is end");
		
	}
}
