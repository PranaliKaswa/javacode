package basics;

public class VariablesinJava {
	
	int empid;
	double salary;
	String name;
	
	void emp_details(int empid,double salary,String name)
	{
		
		System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
		VariablesinJava g1 = new VariablesinJava();
		System.out.println(g1.empid);
	}
}
