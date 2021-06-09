//시험 점수의 합계, 평균 , 최고점 , 최저점을 구하는 프로그램을 작성하시오
package exampletest;

import java.util.Scanner;

public class Num68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람수 : ");
		int n = sc.nextInt();
		
		int[] exam = new int[n];
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 100;
		
		
		for(int i = 0; i < exam.length; i++) {
			System.out.print(i+1+"번 점수 :");
			int num = sc.nextInt();
			exam[i] = num;
			sum += num;
			avg = sum/n;
			if(max < num) {
				max = num;
			}
			if(min > num) {
				min = num;
			}
		}

		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최고점 : "+max);
		System.out.println("최저점 : "+min);
		

	}

}
