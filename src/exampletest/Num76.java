//6���� �� ����(����,����) �� ������ ���� ����/�л��� ����� ���Ͻÿ�. (2�����迭 ���)	
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
		         {   System.out.print((i+1)+"�� ����:");
		         a[i][j] = sc.nextInt();   
		         }
		         else {
		            System.out.print( "����:");
		         a[i][j] = sc.nextInt();
		         }
		            
		         }
		      }
		      System.out.println("NO   ����   ����   ���");
		      float sum = 0;
		      float math_sum=0;
//		       �������� ����
		         for(int i =0; i< a.length; i++)
		         {
		            float avg = (float)(a[i][0]+a[i][1])/2.0f;
//		                  i�� 1~6���� �ݺ��� ��. 2���� �迭�� ù ���� �κ��� ����
		            sum += a[i][0];
//		                           2���� �迭�� �� ���� �κ��� ����
		            math_sum += a[i][1];
//		                                            i  �ݺ� 
		            System.out.println((i+1)+ " " + (a[i][0])+ " " + (a[i][1])+ " " + avg);
		            
		            
		         }
		         System.out.println("����"+sum/a.length);
		         System.out.println("����"+math_sum/a.length);

		      }}
