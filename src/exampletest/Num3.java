//2개의 실수값을 입력받아 그 합과 평균을 구하는 프로그램을 작성하시오.

package exampletest;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요 : ");
		double a = sc.nextDouble();
		double b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println((a+b)/2);
		
		

	}

}
