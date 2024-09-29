package basics;

class First {
	
	void add()
	{
		System.out.println("add");
	}
	
	static void sub()
	{
		System.out.println("sub");
	}
	
}
public class SingleLevelInheritence_InSamePackage  extends First
	{
		static void mul()
		{
			System.out.println("mul");
		}
		
		public static void main(String[] args) {
		
		
		SingleLevelInheritence_InSamePackage s1 = new SingleLevelInheritence_InSamePackage();
		s1.add();
		sub();
		mul();
		
		
	}
	
	}


