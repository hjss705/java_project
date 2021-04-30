package exampletest;

import java.util.Scanner;

public class Num29ㅡ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b;
		
		
		do {
			System.out.println("정수값을 입력하시오 :");
			int a = sc.nextInt();
			
			if(a < 0) {
				System.out.println(a+" 의 값은 음수입니다.");
			}
			else if (a > 0) {
				System.out.println(a+" 의 값은 양수입니다.");
			}
			else {
				System.out.println("값은 0입니다");
			}
			
			System.out.println("다시한번 입력하시려면 1번을 입력하세요.");
			b = sc.nextInt();
			
		   }while (b == 1);
		

	}

}
