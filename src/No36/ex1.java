package No36;

class O{
	public void a(int param) {
		System.out.println("�������");
		System.out.println(param);
	}
	
	public void a(String param) {
		System.out.println("�������");
		System.out.println(param);
	}
}

public class ex1{
	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");
		o.a("�״�");
		o.a(10);
	}
}
