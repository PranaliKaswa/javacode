package basics;

public class Main_Overload_Static_Method {
public static void main() 
{
  System.out.println(1);		
}

public static void main(String a) 
{
	 System.out.println(2);			
}

public static void main(int a) 
{
	 System.out.println(3);		
}
	
public static void main(char a) 
{
	 System.out.println(4);		
}
	
	public static void main(String[] args) {
		
		main();
		main("pranal");
		main('A');
	}
	

}
