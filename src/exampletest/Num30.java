//3�ڸ� ���� ������ 100 999 �� �Է¹޴����η��� �ۼ��Ͻÿ� �Է��� ���� 3�ڸ� ������������ �ƴϸ� �ٽ� �Է¹޵����ϼ���
package exampletest;

import java.util.Scanner;

public class Num30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�������� �Է��Ͻÿ� :");
			int a = sc.nextInt();
			
			if (a >= 100) {
				if (a <10000) {
					System.out.println("�Է��� �������� "+a+" �Դϴ�.");
					break;
				}
			}
			
			else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�.");
			}
		}

	}

}
