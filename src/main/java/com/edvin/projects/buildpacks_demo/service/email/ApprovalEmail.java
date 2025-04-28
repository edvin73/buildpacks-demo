package com.edvin.projects.buildpacks_demo.service.email;

public class ApprovalEmail implements Email {
	
	public static final String SUBJECT = "Request Approved";

	@Override
	public String getEmailBody() { 
		// Message to inform the user that their request is approved
		return "Your request has been approved.";
	}

	@Override
	public String getEmailSubject() {
		// TODO Auto-generated method stub
		return SUBJECT;
	}

}
