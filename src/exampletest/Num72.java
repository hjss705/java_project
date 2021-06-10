//서로 다른 요소가 동일한 값을 지니지 않도록 [6-10] 프로그램을 수정하시오.
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int[] a = new int [n];
		
		for (int i = 0; i <n; i++) {
			int j;
			do {
				a[i] = 1 + rand.nextInt(10);
				for(j=0; j<i; i++) {
						if( a[j] ==a[i]) {
							count++;
							System.out.print("cnt : " + count);
							break;
						}
				}
			} while( j < i);
		}

	}

}
