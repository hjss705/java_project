//키보드에서 입력한 정수값에서 마지막 자리수를 제외 값, 마지막 자리수 값만 출력

package exampletest;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("입력값 :");
		int a = x.nextInt();
		System.out.println(a / 10);
		System.out.println(a % 10);
		
		

	}

}
