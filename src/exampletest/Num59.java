//float ���� ������ 0.0���� 1.0���� 0.001�� ������Ű�� ǥ���ϰ�, �׿��� int�� ������ 0���� 1000���� 1�� ������Ű�� 1000���� �������� ǥ���Ͻÿ�.
package exampletest;

import java.util.Scanner;

public class Num59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		System.out.println("float           int");
		for(double i = 0; i <=1; i =i+0.001) {
			double k = a/1000.0;
			System.out.printf("%,7f %5.7f\n" , i,k);
			a++;
		}

	}

}
