//정수값을 입력하면 입력한범위의 -5,+5 랜덤 정수값을 출력하는 프로그램을 작성하시오.

package exampletest;

import java.util.Random;
import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("입력값 : ");
		
		int i = sc.nextInt();
		System.out.println(i-5 + ra.nextInt(11));
		

	}

}
