//3개의 정수중 최소값을 구하는 프로그램을 작성하시오.

package exampletest;

import java.util.Scanner;

public class Num21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 :");
		int a = sc.nextInt();
		System.out.println("정수값 : ");
		int b = sc.nextInt();
		System.out.println("정수값 : ");
		int c = sc.nextInt();
		
		 int result1 = (a < b) ? a : b;
	     int result2 = (c < result1) ? c : result1;
	      System.out.println(result2);
		

	}

}
