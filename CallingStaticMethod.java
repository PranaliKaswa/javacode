package basics;

public class CallingStaticMethod {
	
	static void first_method() {
		
		System.out.println("First Method");
	}
	
	
	public static void main(String[] args) {
		second_method();
		
		System.out.println("Main Method");
		forth_method();
		second_method();
		second_method();
		fifth_method();
		third_method();
		first_method();
	}
	
    static void second_method() {
		
		System.out.println("Second Method");
		
	}
    
 static void third_method() {
		
		System.out.println("Third Method");
		
	}
 
 static void forth_method() {
		
		System.out.println("Forth Method");
		
	}
 
 static void fifth_method() {
		
		System.out.println("Fifth Method");
		
	}
	
}
