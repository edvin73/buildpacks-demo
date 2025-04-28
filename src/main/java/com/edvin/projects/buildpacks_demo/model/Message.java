package com.edvin.projects.buildpacks_demo.model;

public class Message {
	
	private String recipient;
	private String message;
	private String subject;
	private String action;
	private String type;

	public Message() {

	}

	public Message(String recipient, String message, String subject, String action, String type) {
		this.recipient = recipient;
		this.message = message;
		this.subject = subject;
		this.action = action;
		this.type = type;
	}

	public String getRecipient() {
		return recipient;
	}	

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getMessage() {
		return message;
	}
		
	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
