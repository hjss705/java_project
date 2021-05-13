package exampletest;

import java.util.Scanner;

public class Num39 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("정수값을 입력하시오 :");
	int a = sc.nextInt();
	int sum = 0;
	
	for(int b = 1; a >= b; b++) {
		sum += b;
		System.out.print(b);
		if(b < a) {
			System.out.print(" + ");
		}
	}
	
	System.out.println(" = "+sum);
  }
	

}
