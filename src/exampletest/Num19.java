//두개의 정수 값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 :");
		int a = sc.nextInt();
		System.out.println("정수값 : ");
		int b = sc.nextInt();
		
		if (a > b)
		{
			System.out.println("두값의 차는 : "+(a-b));
		}
		else
		{
			System.out.println("두값의 차는 : "+(b-a));
		}
	
		

	}

}
