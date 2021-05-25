package No39;

class Calculator3{
	int left, right;
	
	public void setOperands(int left, int right) {
		if (right == 0) {
			throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다");
		}
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다. ");
		}
		catch (Exception e) {
	         System.out.println("\n\ne.getMessage()\n"+e.getMessage());
	         System.out.println("\n\ne.toStoring\n"+e.toString());
	         System.out.println("\n\ne.printSrackTrace()\n");
	         e.printStackTrace();
	    }

	}
}

public class ex3{
	public static void main(String[] args) {
		Calculator3 c1 = new Calculator3();
		c1.setOperands(10, 0);
		c1.divide();

		}
	
}