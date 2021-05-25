// 3개의 정수를 읽어서 합계와 평균을 구하는 프로그램을 작성하시오. 평균을 실수로 표현하세요
package exampletest;

import java.util.Scanner;

public class Num57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째값 : ");
		int a = sc.nextInt();
		System.out.print("두번째값 : ");
		int b = sc.nextInt();
		System.out.print("세번째값 : ");
		int c = sc.nextInt();
		
		System.out.println("합계 = "+(a+b+c));
		System.out.println("평균 = "+(a+b+c)/3.0);
		

	}

}
