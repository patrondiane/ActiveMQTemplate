package com.efrei.topic;

import javax.jms.JMSException;
import javax.jms.Topic;
import javax.jms.TopicConnectionFactory;

public class ATopicPublisher{
	
	private TopicConnectionFactory connectionFactory;

	public ATopicPublisher(TopicConnectionFactory connectionFactory, Topic topic) throws Exception{
		super();
		this.connectionFactory = connectionFactory;
	}

	public void publishMessage(String message) throws JMSException {
	}

}
