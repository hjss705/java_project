//3���� �������� ��������(������)���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ :");
		int a = sc.nextInt();
		System.out.println("������ : ");
		int b = sc.nextInt();
		System.out.println("������ : ");
		int c = sc.nextInt();
		
		
		if(a < b) {
			if (a < c) {
				if(b < c)
				System.out.print("���������� :"+a+"��"+b+"��"+c);
			}
		}
		
		if(b < a) {
			if (b < c) {
				if (c < a) {
					System.out.print("���������� :"+b+"��"+c+"��"+a);
				}
			}
		}
		
		if(c < a) {
			if (c < b) {
				if (b < a) {
					System.out.print("���������� :"+c+"��"+b+"��"+a);
				}
			}
		}
		
	

	}

}
