package No25;

class DivisionableCalculator extends MultiplicationableCalculator{
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class ex4{
	public static void main(String[] args) {
		DivisionableCalculator c1 = new DivisionableCalculator();
		c1.setOperands(20, 10);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.division();
	}
}
