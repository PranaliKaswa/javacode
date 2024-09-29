package basics;

abstract class One
{
	abstract void login_logic();
}
public class Concrete_Class extends One
{
	void login_logic() {
		// TODO Auto-generated method stub
		System.out.println("Logic of Login");
	}
	public static void main(String[] args) {
		
		Concrete_Class m1 = new Concrete_Class();
		m1.login_logic();
	}
}
