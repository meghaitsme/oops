package oops;

public class MethodOverloading {
	static String s;
	
	
	//method in the class have different parameters , different return type , same method name.

	public static void main(String[] args) {
		
		double re = add(23,34);
		double re2 = add(23.34,34);
		System.out.println(re);
		System.out.println(re2);	
		
	}
	
	//double re = add(23,34);   print -> both having same leads to  ambiguty 
	
	public static double add(int a, int b) { //leads to ambugity  int a, double b
		return a+b;   // 57
	}
	
	public static double add(double a, int b) {  //leads to ambugity  double a, int b
		return a-b; //-10.66
	}
	

}
