package basics;
public class Access_Specifier_WithMethods {
	
	public static void m1()
	{
		System.out.println(1);
	}
	
	private static void m2()
	{
		System.out.println(2);

	}
	static void m3()
	{
		System.out.println(3);

	}
	protected static void m4()
	{
		System.out.println(4);

	}
	public static void main(String[] args) {
		Access_Specifier_WithMethods.m1();
		Access_Specifier_WithMethods.m2();
		Access_Specifier_WithMethods.m3();
		Access_Specifier_WithMethods.m4();
	}
	

}
