//��ȣ ���� * �� �����ؼ� n���� �������� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n�� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		int b = 0;
		int c = 0;

		for (b = 0; a > b; b++) {
			for (c = 0; c < a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
