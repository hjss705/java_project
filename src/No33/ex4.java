package No33;

abstract class Calculator2{
	int left, right ;
	
	public void SetOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	int _sum() {
		return this.left + this.right;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus2 extends Calculator2{
	public void sum() {
		System.out.println("+ sum :"+_sum());
	}
	
	public void avg() {
		System.out.println("+avg :"+_sum()/2);
	}
}

class CalculatorDecoMinus2 extends Calculator2{
	public void sum() {
		System.out.println("-sum :"+_sum());
	}
		
	public void avg() {
		System.out.println("- avg :"+_sum()/2);
	}
}

public class ex4{
	public static void main(String[] args) {
		CalculatorDecoPlus2 c1 = new CalculatorDecoPlus2();
		c1.SetOperands(10, 20);
		c1.run();
		
		CalculatorDecoMinus2 c2 = new CalculatorDecoMinus2();
		c2.SetOperands(10, 20);
		c2.run();
	}
}
	
	