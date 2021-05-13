package No36;

class O{
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}

public class ex1{
	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");
		o.a("그대");
		o.a(10);
	}
}
