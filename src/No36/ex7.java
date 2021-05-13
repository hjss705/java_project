package No36;

abstract class Calculator2{
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

class CalculatorDecoPlus2 extends Calculator2{
	public void sum() {
		System.out.println("+sum :"+_sum());
	}
	
	public void avg() {
		System.out.println("+avg : "+(this.left+this.right)/2);
	}
}

class CalculatorDecoMinus2 extends Calculator2{
	public void sum() {
		System.out.println("-sum : "+_sum());
	}
	
	public void avg() {
		System.out.println("-avg :"+(this.left+this.right)/2);
	}
}

public class ex7{
	public static void execute(Calculator2 cal) {
		System.out.println("실행결과");
		cal.run();
	}
	
	public static void main(String[] args) {
		CalculatorDecoPlus2 c1 = new CalculatorDecoPlus2();
		c1.setOperands(30,80);
		
		CalculatorDecoMinus2 c2 = new CalculatorDecoMinus2();
		c2.setOperands(40,25);
		
		execute(c1);
		execute(c2);
	}
}