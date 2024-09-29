package basics;

import java.util.Scanner;

public class RegistrationFormScannerClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String fname = sc.next();
		
		System.out.println("Enter the Last Name");
		String lname = sc.next();
		
		System.out.println("Enter the Email id Name");
		String email = sc.next();
		
		System.out.println("Enter the Password");
		String password = sc.next();
		
		System.out.println("Enter the Gender");
		String gender = sc.next();
		
		System.out.println("Enter the Present Address");
		String presentaddress = sc.next();
		
		System.out.println("Enter the Permanent Address");
		String paddress = sc.next();
		
		System.out.println("Enter the Pincode");
		int pincode = sc.nextInt();
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
