package basics;


class Google
{
	void login() //Method Overriding
	{
		System.out.println("Login with mobile no.");
	}
}

public class MethodOverriding extends Google {
	
	void login()
	{
		System.out.println("Login with emailid");
	}
	public static void main(String[] args) {
		
		MethodOverriding m1 = new MethodOverriding();
		m1.login();
		
	} 
	

}



