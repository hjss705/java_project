package No36;

public class ex9{
	public static void execute(CalculatorDecoPlus2 cal) {
		System.out.println("실행결과");
		cal.run();
	}
	
	public static void execute(CalculatorDecoMinus2 cal) {
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