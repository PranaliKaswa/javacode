package basics;


interface A
{
	void add();
	
}
interface B
{
	void sub();
}
public class MultipleLevel_Inheritence_Using_Interface implements A,B //Multiple Level Inheritence using interface
{

	@Override
	public void sub() {
		System.out.println("SUB");
		
	}

	@Override
	public void add() {
		System.out.println("ADD");
		
	}

	public static void main(String[] args) {
		
		MultipleLevel_Inheritence_Using_Interface a1 = new MultipleLevel_Inheritence_Using_Interface();
		a1.add();
		a1.sub();
	}
}

