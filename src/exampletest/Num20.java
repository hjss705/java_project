//두 정수값의 차가 10 이하인 경우 두값의 차는 10이하라고 표시하고 그렇지않으면 11이상이라고 표시하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 :");
		int a = sc.nextInt();
		System.out.println("정수값 : ");
		int b = sc.nextInt();
		
		if ((a - b) <= 10)
		{
			if((b - a) <= 10) {
				System.out.println("두값의 차는 10 이하입니다.");
			}
			else
			{
				System.out.println("두값의 차는 10 이상입니다.");
			}
		}
		else
			System.out.println("두값의 차는 10 이상입니다.");
		

	}

}
