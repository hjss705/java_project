//4행 3열의 행렬과 3행 4열의 곱을 구하는프로그램을작성하시오

package exampletest;

import java.util.Scanner;

public class Num75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		2차원 행렬 선언
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		

		System.out.println(a.length+" "+b[0].length+" "+a[0].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("b["+i+"]["+j+"] : ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("ab의 곱");
		for(int i =0; i< a.length;i++) {
			for(int j=0;j< b[0].length;j++) {
				int mul=0;
				int sum=0;
				for(int k=0; k< a[i].length;k++) {
					mul=a[i][k]*b[k][j];
					sum = sum+mul;
				}
				c[i][j] = sum;
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}


	}
	}