package com.hehaoyisheng.testSeller.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aliyun.openservices.ons.api.bean.ConsumerBean;

/**
 * 
 */
public class App {
	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) throws IOException {
		context = new ClassPathXmlApplicationContext("Application.xml");
		context.start();
		ConsumerBean consumer = (ConsumerBean) context.getBean("consumer");
		consumer.isStarted();
		System.out.println("consumer " + consumer.isStarted());
	}
}
