package com.infy.poc.paas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountClient {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:client-applicationContext.xml" });
		AccountServiceTester client = (AccountServiceTester) context.getBean("tester");
		client.testAccountInq();
	}
}