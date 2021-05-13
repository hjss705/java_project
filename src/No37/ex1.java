package No37;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		System.out.println("계산결과는");
		System.out.println(this.left/this.right);
		System.out.println(" 입니다. ");
	}
}

public class ex1{
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();
		}
}