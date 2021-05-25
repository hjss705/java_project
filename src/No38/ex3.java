package No38;

class B2{
	void run() {
		
	}
}

class C2{
	void run() {
		B b = new B();
		b.run();
	}
}

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 c = new C2();
		c.run();

	}

}
