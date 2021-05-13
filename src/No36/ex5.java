package No36;

class G{
	public String x() {
		return "A.x";
	}
}

class H extends G{
	public String x() {
		return"B.x";
	}
	
	public String y() {
		return"y";
	}
}

class H2 extends G{
	public String x() {
		return "B2.x";
	}
}

public class ex5{
	public static void main(String[] args) {
		G obj = new H();
		G obj2 = new H2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}
}