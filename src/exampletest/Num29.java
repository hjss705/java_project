//�������� ��ȣ�� �����ؼ� ǥ���ϴ� ���α׷��� ���ϴ� ��ŭ �ݺ��ؼ� �Է� �� ǥ���ϵ��� �ۼ��Ͻÿ�.
package exampletest;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Num29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���������Է��Ͻÿ� : ");
			int a = sc.nextInt();
			
			if (a < 0) {
				System.out.println(a+" �ǰ��� �����Դϴ�.");
			}
			else if (a > 0) {
				System.out.println(a+" �ǰ��� ����Դϴ�.");
			}
			
			System.out.println("�ٽ��ѹ� �Է��ϽǷ��� 1���� �������� 0���� �Է��Ͻÿ�");
			int b = sc.nextInt();
			
			if (b == 0) {
				break;
			}
			else if (b == 1) {
				continue;
			}
			
			
		}
			
	}
}