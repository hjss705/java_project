//�Է��� �������� 5�� ������������� "5�γ���������ϴٶ��ǥ�ø��ϰ� �ƴϸ� �ƴ϶��ǥ���Ͻÿ�

package exampletest;

import java.util.Scanner;
public class Num17 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("������ :");
			int a = sc.nextInt();
			
			if (a % 5 == 0)
				System.out.println("5�γ���������ϴ�.");
			else if (a < 0)
				System.out.println("���� �������� �Է��߽��ϴ�");
			else
				System.out.println("5�γ�����������ʽ��ϴ�.");

		}

	}