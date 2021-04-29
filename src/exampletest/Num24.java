//입력받은 2개의 정수값을 내림차순(큰순)으로 정렬하는 프로그램을 작성하시오

package exampletest;

import java.util.Scanner;

public class Num24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 :");
		int a = sc.nextInt();
		System.out.println("정수값 : ");
		int b = sc.nextInt();
		
		if (a > b)
		{
			System.out.println("큰값 :" +a+"작은값 : "+b);
		}
		else
			System.out.println("큰값 : "+b+"작은값 : "+a);
	}
}
