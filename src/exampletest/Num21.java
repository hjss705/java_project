//3���� ������ �ּҰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

package exampletest;

import java.util.Scanner;

public class Num21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ :");
		int a = sc.nextInt();
		System.out.println("������ : ");
		int b = sc.nextInt();
		System.out.println("������ : ");
		int c = sc.nextInt();
		
		 int result1 = (a < b) ? a : b;
	     int result2 = (c < result1) ? c : result1;
	      System.out.println(result2);
		

	}

}
