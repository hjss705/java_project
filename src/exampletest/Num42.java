//입력한 정수값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 적으시오 : ");
		int a = sc.nextInt();
		int num = 0;
		
		for(int b = 1; a >= b;b++) {
			if(a % b == 0) {
				System.out.print(b);
				num++;
				if (b < a) {
					System.out.print(",");
				}
			}
		}
		System.out.println("\n약수의 개수 : "+num);
		
	}

}
