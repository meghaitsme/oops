package oops;

public class NonStatic {
	
	//static variables are associated to the class . 
	static int id = 7 ;  // static variables are constants , not declared in constructor . 
	static String title = " This is important";
			int views;
		
	
	NonStatic(int views){ //constrcutor 
		this.views = views; // not static 
	}
	
	void display(){
		System.out.println(id + title + "  likes are "+ views );
	}

	public static void main(String[] args) {

		NonStatic obj = new NonStatic(7);//constructor
		obj.display();
		
		NonStatic obj2 = new NonStatic(10);//constructor
		obj2.display();
		
	}

}
