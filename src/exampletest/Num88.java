//정수를 좌우로 시프트한 값이 , '정수 x2 의 거듭제곱'및 정수/2의 거듭제곱과 같은지 확인하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num88 {

	   public static int pow2(int x,int n) {
		      int result = x;
		      for (int i = 1; i < n; i++) {
		         result *= x; 
		      }
		      return result;
		   }

		   public static void main(String[] args) {
		      Scanner stdIn = new Scanner(System.in);
		      
		      System.out.print("정수 값 입력 : ");
		      int x = stdIn.nextInt();
		      System.out.print("지수 값 입력 : ");
		      int n = stdIn.nextInt();
		      
		      int a = x * pow2(x, n);
		      int b = x / pow2(x, n);
		      int c = x << 3;
		      int d = x >> 3;
		      
		      if (a == c) {
		         System.out.print("a 와 c 값이 일치합니다.");
		         System.out.println();
		      }
		      if (b == d) {
		         System.out.print("b 와 d 값이 일치합니다.");
		      }
		   }

		}