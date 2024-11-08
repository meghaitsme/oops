package oops;



//static 
class accessstaticvar{
	static int a = 10; //hence static variable belongs to class. not object 
}

public class statickeyword {	
	public static void main(String[] args) {
		System.out.println(accessstaticvar.a); // 10 without extending 
	}

}
