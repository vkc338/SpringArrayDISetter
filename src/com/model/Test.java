package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;

import org.apache.poi.ss.formula.functions.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("com/model/Spring.xml");
		Student st = (Student) act.getBean("st");
			
			Contactdetail[] cd=st.getContacts();
			
	
			for( Contactdetail c:cd)
			{
				System.out.println(st.getName());
				System.out.println(c.getCountrycode());
				long[] lg=c.getMobno();
				
			for( int i=0; i<lg.length;i++)
			{
				System.out.println(lg[i]);
			}
			}
	
			
		
		
	}

}
