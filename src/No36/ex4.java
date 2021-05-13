package No36;

class E{
	public String x() {
		return "A.x";
	}
}

class F extends E{
	public String x() {
		return"B.x";
	}
	
	public String y() {
		return"y";
	}
}

public class ex4{
	public static void main(String[] args) {
		E obj = new F();
		System.out.println(obj.x());
	}
}