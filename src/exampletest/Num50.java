//5���� ������ ������ �׷��� ��ü �հ�(�׷캰 �հ� �ƴ� ��ü �׷��� ��)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
//��ü 10���� �׷��� ������ �� �������� Ű����� �Է��Ѵ�. �� �� , 99999�� �Է��ϸ� ��ü�Է� �����ϰ� 88888�� �Է��ϸ� ���� �а��ִ� �׷��� �Է��� �����Ͻÿ�.
package exampletest;

import java.util.Scanner;

public class Num50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		out:for(int i = 1; i <= 10; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.println(i+"�׷�"+j+"���� ���� �Է�:");
				input = sc.nextInt();
				if(input == 88888) {
					break;
				}
				else if(input == 99999) {
					break out;
				}
				sum += input;
			}
			
		}
		System.out.println("������ :"+sum);

	}

}
