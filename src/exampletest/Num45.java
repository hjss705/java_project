//��ȣ ���� * �� �����ؼ� �����ﰢ���� ����ÿ�
package exampletest;

import java.util.Scanner;

public class Num45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n�� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		int b;
		int c;

		for (b = 0; a >= b; a--) {	
			for (c = 0; c < a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}