package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptionhandling {
	// Exception is an unExpected or unwanted event occurs during the runtime execution of the program. 
	// which disrupts the normal flow . 
	//checked , unchecked 
	// Exception can be handle by,  try catch finally throw throws 
	
	//throw exception
	
	void checkAge(int age) {
		
		if(age < 18) {  // age is less than 18 
			throw new IllegalArgumentException("Age must be atleast 18"); //but there is no work around 
		}	
	}
	
	//throwsexception
	void throwsexception() throws InterruptedException,IllegalArgumentException {
		System.out.println("Start ");   //Start
		Thread.sleep(2000);
		System.out.println("Stop"); //Stop
	
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		Exceptionhandling ob = new Exceptionhandling();
		ob.checkAge(19);
		
		ob.throwsexception();
		
		// can we try block without catch block
		
		try {
			System.out.println("insert finally block , to complete try statement ");
		}
		catch(ArithmeticException e) {
			System.out.println("order child");
		}
		catch(Exception e) {
			System.out.println("p ");
		}
		
		
		
		
		
		
//multiple try catch 
		
		try {
			System.out.println("1 try ");   // 1 try 
		} 
		
		catch(ArithmeticException e) {
			System.out.println("1 catch "); //not executed , becoz , try is passed 
		}
		
		catch(NullPointerException e) {
			System.out.println("2nd catch ");
		}
		
		
		
		
		
		
		
		//try catch 
		System.out.println("12"); //12 
		
		int a= 10, b= 20;
		try {
			int result = a + b;  // 10 + 20 
			System.out.println(result); // 30 
		} catch(ArithmeticException e ) {
			System.out.println("invalid expression ");
		}
		System.out.println("continue "); //continue 
		
		
		//printStackTrace
		try {
			FileInputStream read = new FileInputStream("D://read.txt");
		}	catch(FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		System.out.println("comes out and continues execution ");
		System.out.println("Hello"); //Hello
		System.out.println(1); // 1
		System.out.println(2); // 2
		System.out.println(3); // 3

//Practice

		try {	                      // cruial code place in try block .

			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			int result = 10/0;
			System.out.println(result);
		} 
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();   //java.lang.ArithmeticException: / by zero
		                         	//at oops.Exceptionhandling.main(Exceptionhandling.java:12)
			System.out.println("u cannot divide by 0");
		}  
		
		System.out.println(4);  //4

		
		try {
			System.out.println(100/0);      // Airthmatic Exception  divide by zero 
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();            //java.lang.ArithmeticException: / by zero
			                                //at oops.Exceptionhandling.main(Exceptionhandling.java:12)
			System.out.println("u cannot divide by 0");
		}  

		System.out.println(5); // 5
	}  
}
