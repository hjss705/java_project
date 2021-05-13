package No37;

class Calculator2{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다. ");
		}
		catch(Exception e) {
			System.out.println("오류가 발생했습니다 : "+e.getMessage());
		}
	}
}

public class ex2{
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 0);
		c1.divide();
		
		Calculator2 c2 = new Calculator2();
		c1.setOperands(10, 5);
		c1.divide();
		}
	
}