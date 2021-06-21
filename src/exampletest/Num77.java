//행에 따라 열의 개수가 다른 2차원 배열 생성하시오 (행수,열수,각 요소의 값은 키보드로 입력받음)
package exampletest;

import java.util.Scanner;

public class Num77 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("불규칙한 2차"
				+ "원 배열을 생성");
		System.out.print("행 수 : ");
		
		input = sc.nextInt();
		int[][] a = new int[input][];
		for(int i =0; i<a.length;i++) {
			System.out.print(i +"행의 열수 : ");
			input = sc.nextInt();
			a[i] = new int[input];
		}
		
		System.out.println("\n각 요소의 값을 입력합니다.");
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print("c["+i+"]["+j+"] :");
				input = sc.nextInt();
				a[i][j] = input;
			}
			System.out.println();
		}
		
		System.out.println("배열 c의 각 요소 값을 출력");
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
