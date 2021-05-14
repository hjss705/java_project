//n단 숫자 피라미드 표시하는 프로그램을 작성하시오.
package exampletest;

import java.util.Scanner;

public class Num49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하시오 : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int a = 1; a <= n - i; a++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= 2 * i - 1; a++) {
				System.out.print(i%10);
				

			}
			System.out.println();

		}

	}

}
