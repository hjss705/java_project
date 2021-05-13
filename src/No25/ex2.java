package No25;

class Calculator2{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class SubtractionableCalculator extends Calculator2{
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class ex2 {
	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.subtract();
	}

}
