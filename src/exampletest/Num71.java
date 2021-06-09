//요소의 형이 int형인 배열을 만들어서 모든 요소에 1~10 난수를 대입하시오. (요소 수는 키보드로 입력 받을 것)
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i =0; i<n; i++) {
			a[i] = 1+rand.nextInt(10);
		}
		for ( int i = 0;i<n;i++) {
			System.out.println("a["+i+"[=");
		}

	}

}
