package com.greatlearning.profilegenerator.cleint;

import java.util.Scanner;
public class profileGenClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello Duniya");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name - ");
		String fn = scanner.nextLine();
		System.out.println("Enter Last Name - ");
		String ln = scanner.nextLine();
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		String dpt = scanner.nextLine();
		//int dpt = scanner.nextInt();
		
		com.greatlearning.profilegenerator.model.Employee emp=new com.greatlearning.profilegenerator.model.Employee(fn, ln, dpt);
		//System.out.println("In Profile Generator");
		//System.out.println(emp.getDept());
		//System.out.println(com.greatlearning.profilegenerator.service.credentialService.genEmailAddress(fn, ln, emp.getDept()));
		//System.out.println(com.greatlearning.profilegenerator.service.credentialService.genPassword(10));
		com.greatlearning.profilegenerator.service.credentialService.showCredentials(emp);
		scanner.close();
	}

}
