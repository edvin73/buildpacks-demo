package com.edvin.projects.buildpacks_demo.service.email;

import org.springframework.stereotype.Service;

import com.edvin.projects.buildpacks_demo.model.Message;

@Service
public class SmsNotificationSender implements NotificationSender {

	@Override
	public Message sendNotification(NotificationRequest request) {
		
		if (!(request instanceof SmsNotificationRequest)) {
			throw new IllegalArgumentException("Invalid request type for SMS notification");
		}
		
		// Validate the request
		if (request.getRecipient() == null || request.getMessage() == null) {
			throw new IllegalArgumentException("Recipient and message cannot be null");
		}

		// Send SMS notification
		System.out.println("Sending SMS to " + request.getRecipient());
		System.out.println("Message: " + request.getMessage());

		// Additional logic for sending SMS can be added here
		System.out.println("SMS sent successfully!");
		
		Message message = new Message();
		message.setType("SMS");
		message.setAction("Sending SMS");
		message.setRecipient(request.getRecipient());
		message.setMessage(request.getMessage());
		
		return message;
		
		// Implement actual SMS sending logic here using Twilio or another SMS service
	}

	

}
