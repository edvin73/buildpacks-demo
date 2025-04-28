package com.edvin.projects.buildpacks_demo.service.email;

public class InformativeEmail implements Email {

	public static final String SUBJECT = "Request Information";

	@Override
	public String getEmailBody() {
		// Message to inform the user about the request
		return "Your request is being processed.";
	}

	@Override
	public String getEmailSubject() {
		return SUBJECT;
	}

}
