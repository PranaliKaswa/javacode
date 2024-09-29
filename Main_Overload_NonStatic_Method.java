package basics;

public class Main_Overload_NonStatic_Method {
	
	
	public void main()
	{
		System.out.println(1);
	}

	public void main(char a)
	{
		System.out.println(2);
	}

	public void main(int b)
	{
		System.out.println(3);
	}

	public static void main(String[] args) {
		
		Main_Overload_NonStatic_Method m1 = new Main_Overload_NonStatic_Method();
		m1.main();
		m1.main('A');
		
		m1.main(4);
		
	}

}
