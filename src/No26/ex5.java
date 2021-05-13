package No26;

class Calculator2{
	int left, right;
	
	public Calculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
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

class SubtractionableCalculator2 extends Calculator{
	public SubtractionableCalculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class ex5 {
	public static void main(String[] args) {
		SubtractionableCalculator2 c1 = new SubtractionableCalculator2(10,20);
		c1.sum();;
		c1.avg();
		c1.subtract();
	}

}