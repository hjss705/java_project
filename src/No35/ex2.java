package No35;

class CalculatorDummy{
	public void SetOperands(int first, int second, int third) {
	}
	
	public int sum() {
		return 60;
	}
	
	public int avg() {
		return 20;
	}
}

public class ex2{
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.SetOperands(10,20,30);
		System.out.println(c.sum()+c.avg());
	}
}