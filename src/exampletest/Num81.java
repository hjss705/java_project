package exampletest;

import java.util.Scanner;

public class Num81 {
	public static int min (int a, int b, int c) {
		
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min ) {
			min = c;
		}
		return min;
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3���� ���� �Է� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("�ּҰ��� " + min(a,b,c)+" �Դϴ�.");
	}

}
