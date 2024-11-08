package oops;

public class Constructorchaining {

	String name;
	int size;
	private char[] a;
	int i;

	Constructorchaining(String name){ // when instance varaible and the local var both r same , still it 
		//returns null value evne after passing the value to the object parameters. 
		this.name = name; //rahul
		//	name = name;  // null, means it is refering to local variable . 
	}

	void display() {
		System.out.println(name); //null // on applying this keyword returns the value .rahul
	}


	public static void main(String[] args) 
	{
		Constructorchaining ob = new Constructorchaining("rahul");
	//	ob.display();    //rahul
	//	ob.m2(); //method of another method 
	//	ob.calculate(30); // 30
		Constructorchaining obj = new Constructorchaining();
		Constructorchaining obj2 = new Constructorchaining(10,20);// 20 , parameterized 
		
	//	obj2.calculate(23);   // 23 
		
	//	obj.m4(); //this refers to object and object speciifed as parameter to method 

		
		Constructorchaining passvaluetoconstructor = new Constructorchaining(25);
	//	passvaluetoconstructor.display1();
	}


	//2. use to invoke method of another method 
	void m1() {
		System.out.println("method of another method "); //method of another method 
	}
	void m2() {
	//	this.m1(); 
		m1(); //if u dont add this keyword , compiler will add this keyword and invoke 
		//current class method implicitly.
	}
	
	// 3. invoke constructor in another constrcutor using this()
	
	Constructorchaining() {
		int a = 20;
		System.out.println(a); // 20 
	}
	
	Constructorchaining(int a,int b ){ // 10, 20 
		this(); // 20 
		System.out.println("parameterised constructor");
	}
	void calculate(int a) {
 		System.out.println(a);
	}
	
	//4. this keyword can be used to pass the argument for a method call
	
	void m3(Constructorchaining obj) {
		System.out.println("this refers to object and object speciifed as parameter to method ");
	}
	void m4() {
		m3(this);
	}
	
	Constructorchaining(int j){
		this.i= j;
	}
	
	void display1()
	{
		System.out.println(i);
	}
	
	
	// 
	
	

}
