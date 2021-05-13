package No26;

class Calculator4{
	int left, right;
	
	public Calculator4() {
		
	}
	
	public Calculator4(int left, int right) {
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

class SubtractionableCalculator4 extends Calculator4{
	public SubtractionableCalculator4(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class ex7 {
	public static void main(String[] args) {
		SubtractionableCalculator4 c1 = new SubtractionableCalculator4(10,20);
		c1.sum();;
		c1.avg();
		c1.subtract();
	}

}