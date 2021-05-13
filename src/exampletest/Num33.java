//카운트다운을 하이소.
package exampletest;

import java.util.Scanner;

public class Num33 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("카운트를 입력하시오 : ");
	int a = sc.nextInt();
	
	for (int i = a; i >= 0; i--) {
		System.out.println(i);
		}
	}
	
}
