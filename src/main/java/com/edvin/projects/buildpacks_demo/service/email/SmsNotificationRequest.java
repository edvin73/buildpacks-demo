package com.edvin.projects.buildpacks_demo.service.email;

import org.springframework.stereotype.Service;

@Service
public class SmsNotificationRequest implements NotificationRequest {

	private String recipient;
	private String message;

	public SmsNotificationRequest() {
		
	}

	@Override
	public String getRecipient() {
		return recipient;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
