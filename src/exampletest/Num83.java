//1부터 n까지 정수의 합을 구해서 봔환하는 메서드를 작성하시오.
package exampletest;

import java.util.Scanner;

public class Num83 {
	public static int sumUP (int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오 : ");
		int n = sc.nextInt();
		System.out.println("합은 : "+sumUP(n)+" 입니다");

	}

}
