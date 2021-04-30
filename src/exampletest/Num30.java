//3자리 양의 정수값 100 999 를 입력받는프로램을 작성하시오 입력한 값이 3자리 양의정수값이 아니면 다시 입력받도록하세요
package exampletest;

import java.util.Scanner;

public class Num30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수값을 입력하시오 :");
			int a = sc.nextInt();
			
			if (a >= 100) {
				if (a <10000) {
					System.out.println("입력한 정수값은 "+a+" 입니다.");
					break;
				}
			}
			
			else {
				System.out.println("다시 입력바랍니다.");
			}
		}

	}

}
