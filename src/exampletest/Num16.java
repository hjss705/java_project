//2���� ���� a,b���� �о a,b�� ��Ұ��踦 ������ ����ǥ���ϴ����α׷����ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;
public class Num16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� : ");
		int a = sc.nextInt();
		System.out.println("b�� : ");
		int b = sc.nextInt();
		
		if (a < b)
			System.out.println("B��ũ��");
		else if (a > b)
			System.out.println("A��ũ��");
		else
			System.out.println("A��B������");

	}

}
