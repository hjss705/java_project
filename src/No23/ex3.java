package No23;

public class ex3{
	static int i;//��������
	
	static void a() {
		int i = 0;  //��������
	}
	
	public static void main(String[] args) {
		for (int i =0; i< 5; i++) {
			a();
			System.out.println(i);
		}
	}
}