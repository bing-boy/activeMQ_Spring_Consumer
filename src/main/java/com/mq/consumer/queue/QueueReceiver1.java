package com.mq.consumer.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component
public class QueueReceiver1 implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
			String textMsg = ((TextMessage)message).getText();
			System.out.println("QueueReceiver1 accept msg: " + textMsg);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
