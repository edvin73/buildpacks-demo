package com.edvin.projects.buildpacks_demo.service.email;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	
	private final Map<String, NotificationSender> senders;
	
	public NotificationService(Map<String, NotificationSender> senders) {
		this.senders = senders;
	}
	
	public void registerSender(String type, NotificationSender sender) {
		senders.put(type.toLowerCase(), sender);
	}
	
	public void send(String type, NotificationRequest request) {
		
		NotificationSender sender = senders.get(type.toLowerCase());
		
		if (sender == null) {
			throw new IllegalArgumentException("Notification type not supported: " + type);
		} else {
			sender.sendNotification(request);
		}

	}
	
	
}