//1부터 n까지 정수값에 각 값을 제곱해서 표시하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하시오 : ");
		int a = sc.nextInt();
		int b;
		
		for(b = 1;a >= b; b++) {
			System.out.println(b+"의 제곱은 "+(b*b)+" 입니다");
		}
	}

}
