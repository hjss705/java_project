//���شٿ������ ����ÿ�...
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int a = r.nextInt(100)+10;
		
		do {
			System.out.println("10���� 99���� ������ ������ �Ѽ��ڸ� �Է��Ͻÿ� : ");
			int b = sc.nextInt();
			
			if (b == a) {
				System.out.println("�����Դϴ�.");
			}
			
			else if (b < a){
				System.out.println("�� �������ڸ� �Է��Ͻÿ�");
			}
			else{
				System.out.println("�� �������ڸ� �Է��Ͻÿ�");
			}
			
		}while(true);
		
	}

}
