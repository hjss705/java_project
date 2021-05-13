package No36;

interface I2{
	public String A();
}

interface I3 {
	public String B();
}

class D2 implements I2,I3 {
	public String A() {
		return"A";
	}
	
	public String B() {
		return"b";
	}
}

public class ex11{
	public static void main(String[] args) {
		D2 obj = new D2();
		I2 objI2= new D2();
		I3 objI3 = new D2();
		
		obj.A();
		obj.B();
		
		objI2.A();
		//objI2.B();
		
		//obj3.A();
		objI3.B();
	}
}
