//기호 문자 * 을 나열해서 n단의 가로가 3 단 세로가 5단인 표시하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하시오 : ");
		int a = sc.nextInt();
		int b = 0;
		int c = 0;

		for (b = 1; a + 2 >= b; b++) {
			for (c = 1; c <= a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
