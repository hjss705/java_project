//�Է��� ������ŭ *�� ����Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� *�� ǥ���ұ�� ?");
		int n = sc.nextInt();
		int i = 0;
		
		if(n>0) {
			while (i < n) {
				System.out.print("*");
				i++;
			}
			System.out.println();
		}
		
	}

}
