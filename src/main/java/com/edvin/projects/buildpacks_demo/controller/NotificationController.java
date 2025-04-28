package com.edvin.projects.buildpacks_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edvin.projects.buildpacks_demo.service.email.ApprovalEmail;
import com.edvin.projects.buildpacks_demo.service.email.EmailNotificationRequest;
import com.edvin.projects.buildpacks_demo.service.email.EmailNotificationSender;
import com.edvin.projects.buildpacks_demo.service.email.InformativeEmail;
import com.edvin.projects.buildpacks_demo.service.email.NotificationRequest;
import com.edvin.projects.buildpacks_demo.service.email.NotificationService;
import com.edvin.projects.buildpacks_demo.service.email.RejectEmail;
import com.edvin.projects.buildpacks_demo.service.email.SmsNotificationSender;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
	
	private final NotificationService notificationService;
	
	public NotificationController(NotificationService notificationService) {
		this.notificationService = notificationService;
		this.notificationService.registerSender("email", new EmailNotificationSender());
		this.notificationService.registerSender("sms", new SmsNotificationSender());
	}
	
	// Endpoint to send notifications
	@PostMapping("/{type}")
    public void sendNotification(@PathVariable String type, 
    							 @RequestBody NotificationRequest request) {
        
		notificationService.send(type, request);
    } 
	
	@PostMapping("/email/reject")
    public ResponseEntity<EmailNotificationRequest> sendRejectEmail(@RequestBody EmailNotificationRequest request) {
		
		RejectEmail rejectEmail = new RejectEmail();
		
		request.setSubject(rejectEmail.getEmailSubject());
		request.setMessage(rejectEmail.getEmailBody());
		
        notificationService.send("email", request);
        
        return ResponseEntity.ok(request);
    }
	
	@PostMapping("/email/approval")
	public ResponseEntity<EmailNotificationRequest>  sendApprovalEmail(@RequestBody EmailNotificationRequest request) {
        
        ApprovalEmail approvalEmail = new ApprovalEmail();
        
        request.setSubject(approvalEmail.getEmailSubject());
        request.setMessage(approvalEmail.getEmailBody());
        
        notificationService.send("email", request);
        
        return ResponseEntity.ok(request);
	}
	
	@PostMapping("/email/informative")
	public ResponseEntity<EmailNotificationRequest>  sendInformativeEmail(@RequestBody EmailNotificationRequest request) {

		InformativeEmail  informativeEmail = new InformativeEmail();

		request.setSubject(informativeEmail.getEmailSubject());
		request.setMessage(informativeEmail.getEmailBody());

		notificationService.send("email", request);
		
		return ResponseEntity.ok(request);
	}
	

}
