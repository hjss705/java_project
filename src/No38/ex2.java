package No38;

class B{
	void run() {
   }
}

class C{
	void run() {
		B b = new B();
		b.run();
	}
}

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.run();

	}

}
