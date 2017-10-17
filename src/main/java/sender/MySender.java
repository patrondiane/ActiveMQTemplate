package sender;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.QueueConnectionFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySender {

	public static void main(String[] args) {
		
		try{
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextJMS.xml");
			QueueConnectionFactory factory = (QueueConnectionFactory) applicationContext.getBean("connectionFactory");
			
			Queue queue = (Queue) applicationContext.getBean("queue");
			// connection au message broker
			QueueConnection connection = factory.createQueueConnection();
			// ouvrir session sans transaction (1 seul message) et acquitement automatique
			QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			connection.start();
			// créer et envoyer message
			TextMessage message = session.createTextMessage("bonjour");
			QueueSender sender = session.createSender(queue);
			sender.send(message);
			
			session.close();
			connection.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}



	}

}
