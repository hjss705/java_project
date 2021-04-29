//3개의 정수값을 오름차순(작은순)으로 정렬하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 :");
		int a = sc.nextInt();
		System.out.println("정수값 : ");
		int b = sc.nextInt();
		System.out.println("정수값 : ");
		int c = sc.nextInt();
		
		
		if(a < b) {
			if (a < c) {
				if(b < c)
				System.out.print("내림차순은 :"+a+"ㅡ"+b+"ㅡ"+c);
			}
		}
		
		if(b < a) {
			if (b < c) {
				if (c < a) {
					System.out.print("내림차순은 :"+b+"ㅡ"+c+"ㅡ"+a);
				}
			}
		}
		
		if(c < a) {
			if (c < b) {
				if (b < a) {
					System.out.print("내림차순은 :"+c+"ㅡ"+b+"ㅡ"+a);
				}
			}
		}
		
	

	}

}
