//�Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����ÿ� : ");
		int a = sc.nextInt();
		int num = 0;
		
		for(int b = 1; a >= b;b++) {
			if(a % b == 0) {
				System.out.print(b);
				num++;
				if (b < a) {
					System.out.print(",");
				}
			}
		}
		System.out.println("\n����� ���� : "+num);
		
	}

}
