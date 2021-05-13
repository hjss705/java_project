package No35;

class CalculatorDummy2 implements ex4{
	public void setOperands(int first, int second, int third) {
	}
	
	public int sum() {
		return 60;
	}
	
	public int avg() {
		return 30;
	}
}

public class ex5{
	public static void main(String[] args) {
		CalculatorDummy2 c = new CalculatorDummy2();
		c.setOperands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}
}

