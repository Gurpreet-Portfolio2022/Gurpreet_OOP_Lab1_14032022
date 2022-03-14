package com.greatlearning.profilegenerator.service;

import java.util.Random;

public class credentialService {
	public final static String genEmailAddress(String firstName, String lastName, String Department) {
		return firstName+"."+lastName+"@"+Department+".mycompany.com";
	}	
	public final static String genPassword(int lengthOfPwd) {		
		char[] Password=new char[lengthOfPwd];
		Random randomS = new Random();
		String capitalS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallS = "abcdefghijklmnopqrstuvwxyz";
		String numberS="1234567890";
		String specialS="!@#$%^&*()";
		String mixS = smallS + specialS + capitalS + numberS;
		int rand;
		char c;
		
		if (lengthOfPwd<=8) {
			throw new IllegalArgumentException("Password Length should be minimum 8 character's");
		} 		
				for (int index=0; index<lengthOfPwd; index++) {
					rand = randomS.nextInt(mixS.length());
					c=mixS.charAt(rand);
					Password[index]=c;
				}
		return String.copyValueOf(Password);
	}
	
	public static void showCredentials (com.greatlearning.profilegenerator.model.Employee employee) {
		//System.out.println("In showCredentials");
		//String msgBody="Dear Harshit," + "/n";
		System.out.println("Dear " + employee.getfName() + " your generated credentials are as follows");
		System.out.println("Email    ---> " + employee.geteMail());
		System.out.println("Password ---> " + employee.getPwd());
	}
}