package exampletest;

import java.util.Scanner;

public class Num29��1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b;
		
		
		do {
			System.out.println("�������� �Է��Ͻÿ� :");
			int a = sc.nextInt();
			
			if(a < 0) {
				System.out.println(a+" �� ���� �����Դϴ�.");
			}
			else if (a > 0) {
				System.out.println(a+" �� ���� ����Դϴ�.");
			}
			else {
				System.out.println("���� 0�Դϴ�");
			}
			
			System.out.println("�ٽ��ѹ� �Է��Ͻ÷��� 1���� �Է��ϼ���.");
			b = sc.nextInt();
			
		   }while (b == 1);
		

	}

}
