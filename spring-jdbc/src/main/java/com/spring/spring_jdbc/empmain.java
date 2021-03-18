package com.spring.spring_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class empmain 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		employee e=(employee) ac.getBean("emp");
		DAO dao=(DAO) ac.getBean("empdao");
		System.out.println(dao.save(e));
		List<employee> lst=dao.getallemployee();
		for(employee i:lst)
		{
			System.out.println(i);
		}
	}

}
