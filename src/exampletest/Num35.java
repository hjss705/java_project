//for ��������Ͽ� �Է��Ѱ�����ŭ *�� ����Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��� *�� ����ұ�� :");
		int a = sc.nextInt();
		
		for (int b = a; a > 0; b--) {
			if (b == 0) {
				break;
			}
			System.out.print('*');
			
		}
		
	}

}
