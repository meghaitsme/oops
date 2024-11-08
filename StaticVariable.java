package oops;

public class StaticVariable {

	static int count = 0;

	static int counter(){
		return count++;
	}

	public static void main(String[] args) {
		int val = counter();
		System.out.println(val);
	}

}
