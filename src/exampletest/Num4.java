//삼각형 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하시오.

package exampletest;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("밑변값 : ");
		double a = sc.nextDouble();
		System.out.println("높이값 : ");
		double b = sc.nextDouble();
		
		System.out.println(a*b/2);

	}

}
