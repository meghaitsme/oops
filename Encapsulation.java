package oops;

import java.util.Scanner;

class singleunit{   // 2 class -> 1 for logic , 1 for main method 
	
		private int pass ; // check even or odd 
		
		singleunit(int pass){
			this.pass = pass;
		}
		
		public void  setEven(int pass){  // pass value to method 
			if(pass % 2 == 0) {
				return;
			}
			this.getTrue();
		}	
			public void  setOdd(int pass){  // pass value to method 
				if(pass % 2 == 0) {
					return ;
				}
				this.getFalse();
		}
		
		public void getTrue() {
			System.out.println("Even number ");
		}
		public void getFalse() {
			System.out.println("odd number ");
		}
		
}

public class Encapsulation {

	public static void main(String[] args) {
		  //if u use constructors, then pass value to the constructor  
		
		System.out.println("Enter number to check Even or odd ");
		Scanner read = new Scanner(System.in);
		int pass = read.nextInt();
		System.out.println(pass); // 31
		
		singleunit ob = new singleunit(pass);
		
		if(pass % 2 == 0) {
		ob.setEven(pass);
		} else {
			ob.setOdd(pass);
		}
	}
}
