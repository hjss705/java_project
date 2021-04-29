//정수값을 읽어 부호(양수 /음수/0)을 판정하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 : ");
		int a = sc.nextInt();
		if (a == 0)
			System.out.println("0");
		else if (a < 0)
			System.out.println("음수");
		else
			System.out.println("양수");
	}

}

