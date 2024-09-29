package basics;

public class ParameterizedNonStaticMethod {
	
	
	void multiply(float a, float b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedNonStaticMethod n1 = new ParameterizedNonStaticMethod();
		n1.multiply(2.435f,46.435f);
		}

}
