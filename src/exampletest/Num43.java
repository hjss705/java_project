//1���� n���� �������� �� ���� �����ؼ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		int b;
		
		for(b = 1;a >= b; b++) {
			System.out.println(b+"�� ������ "+(b*b)+" �Դϴ�");
		}
	}

}
