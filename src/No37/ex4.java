package No37;

class Calculator4{
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
			System.out.println("e.getMessage()"+e.getMessage());
		}
		System.out.println("Divide End");
	}
}

public class ex4{
	public static void main(String[] args) {
		Calculator4 c1 = new Calculator4();
		c1.setOperands(10, 0);
		c1.divide();
	}
}