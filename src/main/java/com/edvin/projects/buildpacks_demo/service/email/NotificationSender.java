package com.edvin.projects.buildpacks_demo.service.email;

import com.edvin.projects.buildpacks_demo.model.Message;

public interface NotificationSender {
	
	Message sendNotification(NotificationRequest request); 

}
