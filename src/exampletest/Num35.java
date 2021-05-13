//for 문을사용하여 입력한개수만큼 *을 출력하시오
package exampletest;

import java.util.Scanner;

public class Num35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 *을 출력할까요 :");
		int a = sc.nextInt();
		
		for (int b = a; a > 0; b--) {
			if (b == 0) {
				break;
			}
			System.out.print('*');
			
		}
		
	}

}
