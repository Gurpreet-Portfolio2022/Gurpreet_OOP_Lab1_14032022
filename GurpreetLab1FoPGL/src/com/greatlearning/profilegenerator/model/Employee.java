package com.greatlearning.profilegenerator.model;

public class Employee {
	private final String fName;
	private final String lName;
	private final String dept;
	private final String eMail;
	private final String pwd;
		
	public Employee (String firstName, String lastName, String department)
	//public Employee (String firstName, String lastName, int department)
	{
		
		this.fName=firstName;
		this.lName=lastName;
		switch(department) {
			case "1":
				this.dept="Technical";
				break;
			case "2":
				this.dept="Admin";
				break;	
			case "3":
				this.dept="HumanResource";
				break;
			case "4":
				this.dept="Legal";
				break;
			default:
				this.dept="Default";
				//break;
		}	
		this.eMail = com.greatlearning.profilegenerator.service.credentialService.genEmailAddress(this.fName, this.lName, this.dept);
		this.pwd = com.greatlearning.profilegenerator.service.credentialService.genPassword(10);
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getDept() {
		return dept;
	}

	public String geteMail() {
		return eMail;
	}

	public String getPwd() {
		return pwd;
	}

	

}
