//기호 문자 * 을 나열해서 직각삼각형을 만드시오
package exampletest;

import java.util.Scanner;

public class Num45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하시오 : ");
		int a = sc.nextInt();
		int b;
		int c;

		for (b = 0; a >= b; a--) {	
			for (c = 0; c < a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
