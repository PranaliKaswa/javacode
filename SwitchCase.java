package basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Press 1 for Chrome Browser");
		System.out.println("Press 2 for Edge Browser");
		System.out.println("Press 3 for Safari Browser");
		System.out.println("Press 4 for IE Browser");
		Scanner sc = new Scanner(System.in);
		int browser = sc.nextInt();		
		switch(browser)
		{
		case 1:
			System.out.println("Launch Chrome Browser");
			break;
			
		case 2:
			System.out.println("Launch Edge Browser");
			break;
			
		case 3:
			System.out.println("Launch Safari Browser");
			break;

		case 4:
			System.out.println("Launch IE Browser");
			break;

		default:
		{
			System.out.println("Sory choose differnt browser");
		}
		}
			 
	
	}
}
