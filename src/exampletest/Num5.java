//구의 겉넓이와 부피를 구하는 프로그램을 작성하시오.

package exampletest;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.1416;
		
		System.out.println("구의 넓이 : ");
		double i = sc.nextDouble();
		System.out.println("구의 부피 : ");
		double v = sc.nextDouble();
		
		System.out.println(4/3*PI*i*i*i);
		System.out.println(4*PI*i*i);
		

	}

}
