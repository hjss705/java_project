//기호 문자 * 을 나열해서 직각삼각형을 만드시오
package exampletest;

import java.util.Scanner;

public class Num48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하시오 : ");
		int n = sc.nextInt();
		
		
		for(int i = 1 ;i<=n;i++) {
			for(int a = 1; a<=n-i; a++) {
				System.out.print(" ");
			}
			for(int a = 1; a<=2*i-1; a++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
