package basics;

public class Static_NonStatic_Method {
	
	static void add()
	{
		int a = 10;
		int b = 100;
		int c = a+b;
		
		System.out.println(c);
	}
	

	void sub(int a, int b)
	{
		int c = a-b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		add();
		Static_NonStatic_Method n1 = new Static_NonStatic_Method();
		n1.sub(100, 90);
		
	}

}
