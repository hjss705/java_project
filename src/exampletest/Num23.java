//Ű���忡�� �Է��� 2���� �������� �������� ū���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ :");
		int a = sc.nextInt();
		System.out.println("������ : ");
		int b = sc.nextInt();
		
		if (a > b)
		{
			System.out.print("�ִ��� :"+ a + "�ּҰ��� :" + b);
		}
		else if (b > a)
		{
			System.out.print("�ִ��� :"+ b + "�ּҰ��� :" + a);
		}
		else
			System.out.print("�����ϴ�");

	}

}
