package basics;
 class SubClass1
 {
	static void add()
	{
		System.out.println("add");
	}
 }
 
 class Subclass2 extends SubClass1
 {
	   void sub()
		{
			System.out.println("sub");
		} 
 }

 public class MultiLevelInSameClass extends Subclass2
 {
	
	 static void mul()
		{
			System.out.println("mul");
		}
	 
	 public static void main(String[] args) {
		 
		 mul();
		 add();
		 MultiLevelInSameClass m1 = new MultiLevelInSameClass();
		 m1.sub();
	}
 }
 
