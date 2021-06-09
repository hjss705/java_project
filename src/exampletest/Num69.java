//배열의 입력받아 특정 값을 가지는 요소를 찾으시오 동읽밧의 요소가 여러개 있으면 가장 앞에 위치한 요소를 찾는 프로그램을 작성하시오.
package exampletest;

import java.util.Scanner;

public class Num69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]);
			a[i] = sc.nextInt();
		}
		
		System.out.print("찾는 숫자 :");
		int k = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			if(a[0] == k ) {
				break;
		    }	
	    }
		if(k<n) {
			System.out.print("찾는숫자는"+a[0]+"에 있습니다.");
		}
		else {
			System.out.print("없음");
		}

	}

}
