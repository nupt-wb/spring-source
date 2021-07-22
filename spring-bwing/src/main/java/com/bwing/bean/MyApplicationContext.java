package com.bwing.bean;

import com.bwing.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
		Person person = (Person)applicationContext.getBean("person");

		System.out.println(person.getName());

//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("classpath*:application.xml");
//		Person person = context.getBean("person", Person.class);
//		System.out.println(person.getName());

	}
}
