//��ȣ ���� * �� �����ؼ� n���� ���ΰ� 3 �� ���ΰ� 5���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n�� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		int b = 0;
		int c = 0;

		for (b = 1; a + 2 >= b; b++) {
			for (c = 1; c <= a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
