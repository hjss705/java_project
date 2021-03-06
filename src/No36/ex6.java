package No36;

abstract class Calculator{
	int left,right;
	
	public void setOperands(int left, int right) {
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

class CalculatorDecoPlus extends Calculator{
	public void sum() {
		System.out.println("+sum :"+_sum());
	}
	
	public void avg() {
		System.out.println("+avg : "+(this.left+this.right)/2);
	}
}

class CalculatorDecoMinus extends Calculator{
	public void sum() {
		System.out.println("-sum : "+_sum());
	}
	
	public void avg() {
		System.out.println("-avg :"+(this.left+this.right)/2);
	}
}

public class ex6{
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOperands(30,80);
		c1.run();
		
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOperands(40,25);
		c2.run();
	}
}