//6명의 두 과목(국어,수학) 의 점수로 부터 과목별/학생별 평균을 구하시오. (2차원배열 사용)	
package exampletest;

import java.util.Scanner;

public class Num76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc= new Scanner(System.in);
		      int [][] a = new int[6][2];
		      int [][] b = new int [a.length][a[0].length];

		      for(int i =0; i < a.length; i++)
		      {
		         for(int j =0; j<a[0].length; j++)
		         {
		                        
		         if(j==0)   
		         {   System.out.print((i+1)+"번 국어:");
		         a[i][j] = sc.nextInt();   
		         }
		         else {
		            System.out.print( "수학:");
		         a[i][j] = sc.nextInt();
		         }
		            
		         }
		      }
		      System.out.println("NO   국어   수학   평균");
		      float sum = 0;
		      float math_sum=0;
//		       이중포문 연습
		         for(int i =0; i< a.length; i++)
		         {
		            float avg = (float)(a[i][0]+a[i][1])/2.0f;
//		                  i가 1~6까지 반복이 됨. 2차원 배열의 첫 번쨰 부분은 국어
		            sum += a[i][0];
//		                           2차원 배열의 두 번쨰 부분은 수학
		            math_sum += a[i][1];
//		                                            i  반복 
		            System.out.println((i+1)+ " " + (a[i][0])+ " " + (a[i][1])+ " " + avg);
		            
		            
		         }
		         System.out.println("국어"+sum/a.length);
		         System.out.println("수학"+math_sum/a.length);

		      }}
