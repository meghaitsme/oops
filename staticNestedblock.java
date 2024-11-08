package oops;

public class staticNestedblock 
{
	
	static class nestedclass   //inner class  + method 
	{
		static int display(int a,int b) {
		    return a+b;	
		}
		
	public static void main(String args[]) {
		
		int val = display(10,20);
		
		System.out.println(val); //30
			System.out.println("hello "); //hello
		}
	}
	
	
	
	

}
