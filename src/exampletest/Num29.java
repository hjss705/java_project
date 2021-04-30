//정수값의 부호를 판정해서 표시하는 프로그램을 원하는 만큼 반복해서 입력 및 표시하도록 작성하시오.
package exampletest;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Num29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수값을입력하시오 : ");
			int a = sc.nextInt();
			
			if (a < 0) {
				System.out.println(a+" 의값은 음수입니다.");
			}
			else if (a > 0) {
				System.out.println(a+" 의값은 양수입니다.");
			}
			
			System.out.println("다시한번 입력하실려면 1번을 끝내려면 0번을 입력하시오");
			int b = sc.nextInt();
			
			if (b == 0) {
				break;
			}
			else if (b == 1) {
				continue;
			}
			
			
		}
			
	}
}