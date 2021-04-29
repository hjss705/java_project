//키보드에서 입력한 2개의 정수값중 작은값과 큰값을 표시하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 :");
		int a = sc.nextInt();
		System.out.println("정수값 : ");
		int b = sc.nextInt();
		
		if (a > b)
		{
			System.out.print("최댓값은 :"+ a + "최소값은 :" + b);
		}
		else if (b > a)
		{
			System.out.print("최댓값은 :"+ b + "최소값은 :" + a);
		}
		else
			System.out.print("같습니다");

	}

}
