package com.edvin.projects.buildpacks_demo.service.email;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.edvin.projects.buildpacks_demo.model.Message;

@Service
public class EmailNotificationSender implements NotificationSender {
	
	Logger logger = LoggerFactory.getLogger(EmailNotificationSender.class);

	@Override
	public Message sendNotification(NotificationRequest request) {
		
		if(!(request instanceof EmailNotificationRequest)) {
			throw new IllegalArgumentException("Invalid request type for EmailNotificationSender");
		}
		
		EmailNotificationRequest emailRequest = (EmailNotificationRequest) request;
		
		//validate request
		if(emailRequest.getRecipient() == null) {
			throw new IllegalArgumentException("At least one receipent is required!");
		}
		
		// validate subject
		if(emailRequest.getSubject() == null) {
			throw new IllegalArgumentException("Subject is required!");
		}
		
		
		Message message = new Message();
		 
		logger.info("Sending Email to {}", emailRequest.getRecipient());
		logger.info("Subject: {}", emailRequest.getSubject());
		logger.info("Message {}", emailRequest.getMessage());
		
		message.setType("Email");
		message.setAction("Sending Email");
		message.setRecipient(emailRequest.getRecipient());
		message.setSubject(emailRequest.getSubject());
		message.setMessage(emailRequest.getMessage());
		
		return message;
		
		// Implement actual email sending logic here using Java Mail API or another service
	}
	
	

}
