package basics;

import java.util.Scanner;

abstract class Facebook_auth
{
	abstract void Facebook_login();
	abstract void Facebook_regustration();
}
abstract class Google_auth extends Facebook_auth
{
	abstract void Google_login();
	abstract void Google_registration();
}
public class AbstractMethod extends Google_auth // Every abstract method needs to be overridden in the child class. Hover over the className and click on"ADD unimplemented methods
{
	
	

	
	void Google_login() { //real logic can be present in this methods
	 
		System.out.println("Login in with mobile no.");
	}

	
	void Google_registration() {
		
		//String name;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name : " );
		String a1 = s1.next();
		
		System.out.println("Enter your age : " );
		int a2 = s1.nextInt();
		
		System.out.println("Enter your mobile no. : " );
		long a3 = s1.nextLong();
		
	}

	void Facebook_login() {
		
		System.out.println("Login Successfull");
		
	}

	void Facebook_regustration() {
		System.out.println("Registration Successfull");
		
	}

public static void main(String[] args) {
	
	AbstractMethod a1 = new AbstractMethod();
	a1.Google_registration();
	a1.Google_login();
	a1.Facebook_login();
	a1.Facebook_regustration();
		
	}
}
