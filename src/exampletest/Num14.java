//2개의 양의 정수값을 읽어서 , 후자가 전자의 약수이면 "B는 a의 약수이다라고 표시하고 
//그렇지않으면B는a의 약수가아니다 라고 표시하는 프로그램을 작성하시오

package exampletest;

import java.util.Scanner;
public class Num14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변수 A :");
		int a = sc.nextInt();
		System.out.print("변수 B :");
		int b = sc.nextInt();
		
		if( a % b == 0)
			System.out.print("B는 A의 약수입니다");
		else
			System.out.print("B는 A의 약수가아닙니다");
		sc.close();
    }
}
