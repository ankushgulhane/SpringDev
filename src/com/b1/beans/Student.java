package com.b1.beans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class Student implements ApplicationListener{
	
	private String name;
	private long sno;
	private String collage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSno() {
		return sno;
	}
	public void setSno(long sno) {
		this.sno = sno;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sno=" + sno + ", collage="
				+ collage + "]";
	}
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		System.out.println("context system is inatialize"+arg0.getClass());
		System.out.println("context system is end");
		
	}
	

}
