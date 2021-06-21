//학습 수 , 각 학급의 학생수 , 그리고 모든학생의 점수를 읽어서 합계와 평균을 구하는 프로그램을 작성하시오. 합계와 평균은 학급 단위와 전교생을 대상으로 하는 것을 구하시오.

package exampletest;

import java.util.Scanner;

public class Num79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 합급의 학생수와 학생의 평균을 구하는 프로그램을 작성해보겠습니다.");
		System.out.print("몇반까지 있습니까?");
		int input = sc.nextInt();		
		int[][] a = new int[input][];
		int totNumber = 0;
		
		int summ = 0;
		for(int i = 0; i < a.length;i++) {
			System.out.print(i+1+"반의 학생수 :");
			input = sc.nextInt();
			a[i] = new int[input];
		}
		
		System.out.println("학생점수를 입력하시오 :");
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(i+1+"반"+(j+1)+"번 :");
				input = sc.nextInt();
				a[i][j] = input;
				summ += a[i][j];
			}
			
		}
		System.out.println("-----------출력----------");
		System.out.println("반      합계      평균");
		int total = 0;
		for(int i = 0; i < a.length;i++) {
			    int sum = 0;
			    for (int j=0; j<a[i].length; j++) {
			    	sum += a[i][j];
			    }
				System.out.println(i+1+"반"+"     "+sum+"      "+(double)sum/a[i].length);
				
		}
		System.out.println("-----------------------");
		System.out.println("합      "+summ+"     "+(double)summ/a.length);
	}

}
