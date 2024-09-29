package basics;

interface AMZ
{
	void amazon_registration();
}

interface AMZ_Login extends AMZ
{
	void amazon_login();
}
public class Interface_Class_Relation implements AMZ_Login
{

	public static void main(String[] args) 
	{
            
		Interface_Class_Relation a1 = new Interface_Class_Relation();
		a1.amazon_registration();
		a1.amazon_login();
	}

	@Override
	public void amazon_registration() {
		
		System.out.println("Registration Done");
		
	}

	@Override
	public void amazon_login() {

        System.out.println("Login with mobile no.");
	}

	

}
