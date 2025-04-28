package com.edvin.projects.buildpacks_demo.service.email;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationRequest implements NotificationRequest {
	
	private String recipient; // Mandatory for all notifications
	private String subject; // Only applies to email
	private String message; // Mandatory for all notifications
//	private String ccList; // Only applies to email
//	private String bccList; // Only applies to email
//	private String additionalRecipients; // Optional for multiple receivers
	
	@Override
	public String getRecipient() {
		// TODO Auto-generated method stub
		return this.recipient;
	}
	
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
//	public String getCcList() {
//		return this.ccList;
//	}
//	
//	public void setCcList(String ccList) {
//		this.ccList = ccList;
//	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
//	public String getBccList() {
//		return this.bccList;
//	}
//	
//	public void setBccList(String bccList) {
//		this.bccList = bccList;
//	}

}
