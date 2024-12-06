package com.ClothStore.utility;

import java.util.Locale;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.ClothStore.domain.Order;
import com.ClothStore.domain.User;


@Component
public class MailConstructor {

	@Autowired
	private Environment environment;
	
	@Autowired
	private TemplateEngine templateRenderer;

	

	public SimpleMailMessage constructResetTokenEmail(String relativePath, Locale region, String key, User client,
			String passwordToken) {

		// send the information where email is send from

		String path = relativePath + "/newUser?token=" + key;
		
		String text = "\nTo verify your email and update your profile, click the link provided. Your password is: \n"
				+ passwordToken;
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(client.getEmail());
		mail.setSubject("Huang's ClothStore - New User");
		mail.setText(path + text);
		mail.setFrom(environment.getProperty("support.email"));
		return mail;

	}

	public MimeMessagePreparator constructOrderConfirmationEmail (User client, Order transaction, Locale localizationSetting) {
		// pass the email to the user and set the user format 
		Context scope = new Context();
		scope.setVariable("order", transaction);
		scope.setVariable("user", client);
		scope.setVariable("cartItemList", transaction.getCartItemList());
		String message = templateRenderer.process("orderConfirmationEmailTemplate", scope);
		
		MimeMessagePreparator messageBuilder = new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage formattedMessage) throws Exception {
				MimeMessageHelper mail = new MimeMessageHelper(formattedMessage);
				mail.setTo(client.getEmail());
				mail.setSubject("Order Confirmation - "+transaction.getIdentifyer());
				mail.setText(message, true);
				mail.setFrom(new InternetAddress("jianghuang588@gmail.com"));
			}
		};
		
		return messageBuilder;
	}
}
