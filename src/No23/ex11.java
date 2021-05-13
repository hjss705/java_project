package No23;

class C2{
	int v = 10;
	
	void m() {
		{
			int v = 20;
			System.out.println(v);
		}
	}
}
public class ex11 {
	public static void main(String[] args){
			C2 c2 = new C2();
			c2.m();
		}
	}

