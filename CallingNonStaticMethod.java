package basics;

public class CallingNonStaticMethod {

	void add()
	{
		int a = 10;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		
	}
	
	void sub()
	{
		int a = 100;
		int b = 200;
		int c = a-b;
	    System.out.println(c);
	}
	public static void main(String[] args) {
		
		CallingNonStaticMethod n1 = new CallingNonStaticMethod(); // Non Static Method
		n1.add();
		n1.sub();
;	}
	
}
