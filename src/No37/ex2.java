package No37;

class Calculator2{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("�������");
			System.out.println(this.left/this.right);
			System.out.println("�Դϴ�. ");
		}
		catch(Exception e) {
			System.out.println("������ �߻��߽��ϴ� : "+e.getMessage());
		}
	}
}

public class ex2{
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 0);
		c1.divide();
		
		Calculator2 c2 = new Calculator2();
		c1.setOperands(10, 5);
		c1.divide();
		}
	
}