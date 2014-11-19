package com.efrei.queue;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;;

public class AQueueSender{
	
	private QueueConnectionFactory connectionFactory;

	public AQueueSender(QueueConnectionFactory connectionFactory, Queue queue) throws Exception{
		super();
		this.connectionFactory = connectionFactory;
	}

	public void sendMessage(String message) throws JMSException {
	}
	
}
