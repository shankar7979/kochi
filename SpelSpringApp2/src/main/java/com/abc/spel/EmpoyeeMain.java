package com.abc.spel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpoyeeMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		Employee bean = beanFactory.getBean("emp1", Employee.class);

		System.out.println(bean);
		bean = beanFactory.getBean("emp2", Employee.class);

		System.out.println(bean);
		System.out.println(beanFactory.getBean("emp3", Employee.class));
	}
}
