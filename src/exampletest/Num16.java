//2개의 변수 a,b값을 읽어서 a,b의 대소관계를 다음과 같이표시하는프로그램을작성하시오
package exampletest;

import java.util.Scanner;
public class Num16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("a값 : ");
		int a = sc.nextInt();
		System.out.println("b값 : ");
		int b = sc.nextInt();
		
		if (a < b)
			System.out.println("B가크다");
		else if (a > b)
			System.out.println("A가크다");
		else
			System.out.println("A와B가같다");

	}

}
