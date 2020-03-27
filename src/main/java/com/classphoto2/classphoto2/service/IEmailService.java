package com.classphoto2.classphoto2.service;

import org.springframework.mail.SimpleMailMessage;

public interface IEmailService {
	public void sendEmail(SimpleMailMessage email);
}
