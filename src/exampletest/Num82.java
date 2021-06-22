package exampletest;

import java.util.Scanner;

public class Num82 {
	public static int mid (int a, int b, int c) {
		
		if (a >= b) {
			if (b >= c) {
				return b;
			}
			else if (a <= c) {
				return a;
			}
			else
				return c;
		}
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시오 :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("중간값은 "+mid(a,b,c)+" 입니다.");
	}

}
