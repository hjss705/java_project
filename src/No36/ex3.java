package No36;

class C{
	public String x() {
		return "x";
	}
}
class D extends C{
	public String y() {
		return "y";
	}
}

public class ex3{
	public static void main(String[] args) {
		C obj = new D();
		obj.x();
		obj.notify();
	}
}