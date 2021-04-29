//입력한 정수값이 5로 나누어떨ㄹ어지면 "5로나누어떨어집니다라고표시를하고 아니면 아니라고표시하시오

package exampletest;

import java.util.Scanner;
public class Num17 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("정수값 :");
			int a = sc.nextInt();
			
			if (a % 5 == 0)
				System.out.println("5로나누어떨어집니다.");
			else if (a < 0)
				System.out.println("음의 정수값을 입력했습니다");
			else
				System.out.println("5로나누어떨어지지않습니다.");

		}

	}