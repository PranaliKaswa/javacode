package basics;


class Grandparent
{
	Grandparent(String a)// constructor
	{
		System.out.println('1');
	}

}

class ParentClass extends Grandparent
{
	ParentClass(int a, int b) // para constructor
	{
		super("Pranali");
		System.out.println('2');
	}
}

public class SuperCallingStatement extends ParentClass
{
	
	SuperCallingStatement() // constructor
	{
		super(0,0); // parametarized super calling statement
		System.out.println('3');
	}
	
	public static void main(String[] args) {
		new SuperCallingStatement();
	}

}
