package oops;

public class superkeywordmain extends Superkeyword{

	int maxSpeed = 100;

	void sound() {   
		//Method 
		System.out.println("subclasss "); // 2nd . super 
		super.sound();
		super.eat();
		// inherit override super keyword 
	}
	
	void eatt() {
		System.out.println("hello subclass ");  // 1st execute 

		this.sound();
		this.eat();
		this.eatt();
		this.sound();
		this.maxSpeed = 23;
	}

	// due to deep recursion its overflow 
	public static void main(String[] args) {
		
		superkeywordmain str = new superkeywordmain(); //child class
		
		
		Superkeyword s = new Superkeyword(); //parent class
		
		
		s.eat(); //required only 
		s.sound();
		s.maxSpeed = 34;
		System.out.println(s.maxSpeed);
		
		str.eat();
		str.eatt();
		str.sound();
		str.maxSpeed = 23;
		System.out.println(str.maxSpeed);
	}
}
