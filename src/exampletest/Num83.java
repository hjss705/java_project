//1���� n���� ������ ���� ���ؼ� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
package exampletest;

import java.util.Scanner;

public class Num83 {
	public static int sumUP (int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		System.out.println("���� : "+sumUP(n)+" �Դϴ�");

	}

}
