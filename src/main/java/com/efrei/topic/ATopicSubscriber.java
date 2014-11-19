package com.efrei.topic;

import javax.jms.Topic;
import javax.jms.TopicConnectionFactory;

public class ATopicSubscriber{
	
	private TopicConnectionFactory connectionFactory;
	
	public ATopicSubscriber(TopicConnectionFactory connectionFactory, Topic topic) throws Exception{
		super();
		this.connectionFactory = connectionFactory;
	}

}
