//double���� �迭�� ��� ����� �հ� ����� ���Ѵ� ���α׷��� �ۼ��Ͻÿ�. (��� ���� ��� ����� ���� Ű����� �Է¹�����)
package exampletest;

import java.util.Scanner;

public class Num70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("a["+i+"[=");
			a[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for(double i:a) {
			sum += 1;
			
		System.out.println("sum: "+sum);
		System.out.println("avg: "+sum/n);
		}

	}

}
