package No32;

class A{
	public String y(){
		return "public void y()";
	}
	
	private String z() {
		return " public void z()";
	}
	
	public String x() {
		return z();
	}
}

public class ex1{
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.y());
		//System.out.println(a.z());
		System.out.println(a.x());
	}
}
