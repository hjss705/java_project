//배열 변수의 값을 표시하는 프로그램을 작성하시오.
//1.배열 공간만할당 값을 확인 2.배열 변수 null 값 확인
package exampletest;

import java.util.Scanner;

public class Num74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		System.out.println("a = " + a);
		a = null;
	    System.out.println("a = " + a);

	}

}
 