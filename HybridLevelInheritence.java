package basics;//Multiple level inheritance
class Nine 
{	
	void college()
{
	System.out.println("going to college next week");
	}
}
class ten extends Nine
{
	void school ()
	{
		System.out.println("going to school");
		}	
}
class Eleven extends ten
{
		void hospital()
		{
			System.out.println("going to hospital");
			}
	}
public class HybridLevelInheritence extends Nine
{
		void play()
		{
			System.out.println("non static method");
			}
	public static void main(String[] args){
	
	System.out.println("main method");	
	HybridLevelInheritence t1=new HybridLevelInheritence();
	t1.play();
	t1.college();
	
	Eleven e1=new Eleven();
	e1.hospital();
	e1.school();
	e1.college();
	}
	}


