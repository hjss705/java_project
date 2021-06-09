//배열의 요소 수와 개별 요소의 값을 입력받아서 표시하는 프로그램을 작성하시오.(표시형식은 배열 초기값과 같은 형식으로, 각 요소의 값을 쉼표로 연결하고{}로 감싼형태로
package exampletest;

import java.util.Scanner;

public class Num67 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 : ");
		
		int n = sc.nextInt();
		
		
		int[] a = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = sc.nextInt();
		}
		System.out.print("a = {");
		if(n >= 2) {
			for(int i =0; i <n-1; i++) {
				System.out.print(a[i]);
				System.out.print(",");
		}
		if (n >= 1) {
			System.out.print(a[n-1]);
		}
		System.out.print("}");	
		}
		
	}

}
  