package com.edvin.projects.buildpacks_demo.service.email;

public class RejectEmail implements Email {

	public static final String SUBJECT = "Request Rejected";

	@Override
	public String getEmailBody() {
		// Message to inform the user that their request is rejected
		return "Your request has been rejected.";
	}
    // TODO Auto-generated method stub
	@Override
	public String getEmailSubject() {
		// TODO Auto-generated method stub
		return SUBJECT;
	}

}
