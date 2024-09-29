package basics;

public class MultiLevelInAnotherClass extends Test2 //Parent Class
{
	void div()
	{
		int a = 100;
		int b = 5;
		int c = a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		MultiLevelInAnotherClass m1 = new MultiLevelInAnotherClass();
		m1.add();
		m1.sub();
		m1.div();
		
	}

}
