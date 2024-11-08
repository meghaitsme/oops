package oops;
public class Constructor {
	public static void main(String[] args) {
		
		shirt obj = new shirt("white",'M');  // 3 constructors , 3 objects 
		shirt obj2 = new shirt(12,34);
		shirt obj3 = new shirt(12.34,23.34);

		System.out.println(obj.Color);
		System.out.println(obj.size);
		System.out.println(obj2.length);
		System.out.println(obj2.width);
		System.out.println(obj3.back);
		System.out.println(obj3.front); //latest will b printed 
	}
}
class shirt {
 static String Color;
	 static char size;
	 static int length;
	 static int width;
	 static double back ; 
	 static double front;
	 
	//@constructor overloading 
	shirt(String setColor,char setSize){
		this.Color = setColor;
		this.size = setSize;
	}
	
	//@constructor overloading 
	shirt(int length,int width){
		this.length = length;
		this.width = width;
	}
	
	//@constructor overloading 
	shirt(double front,double back){
		this.front = front;
		this.back = back;
	}
	void method1() {
		System.out.println(this.front);
	}
}