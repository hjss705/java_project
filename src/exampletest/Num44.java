//�� �� ���������� �Է¹޾Ƽ� �ش��ϴ� ���� ��¿�� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���ϴ� ��ŭ �Է� �� ����Ҽ� �ְ��ϰ�, 1~12 �̿��� ���� �ԷµǴ� ���, ���Էµǵ��� �� ��.
package exampletest;

import java.util.Scanner;

public class Num44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int a = 0;
		
		do {
			System.out.println("���ϴ� ���� �Է��Ͻÿ� : ");
			b = sc.nextInt();
			
			if (b <= 2) {
				System.out.println("�ܿ�");
				System.out.println("�ٽ��Է��Ͻðڽ��ϱ�? (yes:1 no:2)");
				a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
			}
			
	        else if(b <= 4) {
				System.out.println("��");
				System.out.println("�ٽ��Է��Ͻðڽ��ϱ�? (yes:1 no:2)");
				a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
			}
	        else if(b <= 9) {
	        	System.out.println("����");
	        	System.out.println("�ٽ��Է��Ͻðڽ��ϱ�? (yes:1 no:2)");
	        	a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
	        }
	        else if(b <= 10) {
	        	System.out.println("����");
	        	System.out.println("�ٽ��Է��Ͻðڽ��ϱ�? (yes:1 no:2)");
	        	a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
	        }
	        else if(b <= 12) {
	        	System.out.println("�ܿ�");
	        	System.out.println("�ٽ��Է��Ͻðڽ��ϱ�? (yes:1 no:2)");
	        	a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
	        }
	        else
	        	System.out.println("�ٽ� �Ѥ�");
		}while (b > 0);

	}

}
