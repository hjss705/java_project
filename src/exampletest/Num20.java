//�� �������� ���� 10 ������ ��� �ΰ��� ���� 10���϶�� ǥ���ϰ� �׷��������� 11�̻��̶�� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ :");
		int a = sc.nextInt();
		System.out.println("������ : ");
		int b = sc.nextInt();
		
		if ((a - b) <= 10)
		{
			if((b - a) <= 10) {
				System.out.println("�ΰ��� ���� 10 �����Դϴ�.");
			}
			else
			{
				System.out.println("�ΰ��� ���� 10 �̻��Դϴ�.");
			}
		}
		else
			System.out.println("�ΰ��� ���� 10 �̻��Դϴ�.");
		

	}

}
