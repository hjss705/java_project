//두개의 정수값을 읽어서 두 정수 사이에 있는 모든 정수값 작은수부터 큰순으로 표시하는 프로그램을 작성하시오.
package exampletest;

import java.util.Scanner;

public class Num32 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째수 : ");
		int a = sc.nextInt();
		System.out.println("두번째수 : ");
		int b = sc.nextInt();
		
		
		for (int i = a + 1; i < b;i++) {
			System.out.println(i);
			}
		}
		
	}
