//double형인 배열의 모든 요소의 합과 평균을 구한느 프로그램을 작성하시오. (요소 수와 모든 요소의 값은 키보드로 입력받을것)
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
