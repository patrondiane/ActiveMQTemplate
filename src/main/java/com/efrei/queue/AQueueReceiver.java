package com.efrei.queue;

import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;

public class AQueueReceiver{
	
	private QueueConnectionFactory connectionFactory;

	public AQueueReceiver(QueueConnectionFactory connectionFactory, Queue queue) throws Exception{
		super();
		this.connectionFactory = connectionFactory;
	}	
	
}
