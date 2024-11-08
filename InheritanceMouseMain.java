package oops;

public class InheritanceMouseMain {

	public static void main(String[] args) {
		
		//entend the existing class member , inherit 
		InheritanceMouse1 obj = new InheritanceMouse1();
		obj.Lftclk();
		obj.Rtclk();
		
		InheritanceMouse2 obj2 = new InheritanceMouse2();
		obj2.Connect();
		obj2.Lftclk();
		obj2.Rtclk();
		obj2.Scrollup();
		obj2.Scrolldown();
		

	}

}
