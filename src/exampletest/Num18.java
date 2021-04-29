//2개의 실수값 중에서 큰 값을 표시하는 프로그램을 작성하시오.

package exampletest;

import java.util.Scanner;

public class Num18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력값 : ");
		double a = sc.nextDouble();
		
		System.out.println("입력값 : ");
		double b = sc.nextDouble();
		
		if (a > b) {
			System.out.print(a);
		}
		else {
			System.out.println(b);
		}

	}

}
