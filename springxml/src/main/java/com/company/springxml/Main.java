package com.company.springxml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationcontext.xml");
		
		TV tv = (TV)factory.getBean("tv");//class면 .___.class 입력
		tv.powerOn();
		tv.volumeUp();
		tv.powerOff();
		
		factory.close();
	}
	
}
