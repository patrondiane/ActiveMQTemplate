package com.efrei.topic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTopicSubscriber {

	public static void main(String[] args) {
		
		try{
		
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextJMS.xml");

			ATopicSubscriber subcriber = (ATopicSubscriber) applicationContext.getBean("topicSubscriber");
		
			Thread.sleep(10000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
