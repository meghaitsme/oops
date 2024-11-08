package oops;
public class Thiskeyword {
	
	int i,j;

	Thiskeyword(int a,int b){    //this keyword used only in this class , 
		this.i = a;
		this.j = b;
	}
	
	int count(){
		return (i + j);
	}
	
	void display() {
		System.out.println(count());
	}
	
	public static void main(String[] args) {
		Thiskeyword obj = new Thiskeyword(20,23);
		obj.display();
	}

}
