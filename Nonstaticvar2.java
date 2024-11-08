package oops;

public class Nonstaticvar2 {
	
	static int count = 0; // 1 2 3  
	//int count = 0 ;  1 1 1 
	
	Nonstaticvar2(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		//objects stored in stack 
		Nonstaticvar2 ob1 = new Nonstaticvar2(); // o/p 1 , becoz each obj stored sepeartely in stack
		Nonstaticvar2 ob2 = new Nonstaticvar2(); // o/p 1 
		Nonstaticvar2 ob3 = new Nonstaticvar2(); // o/p 1 	
		// if u specified static, count will be 1 2 3 
		//if u not specified static , count  wil b 1 1 1 
	}
}
