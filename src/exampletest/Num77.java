//�࿡ ���� ���� ������ �ٸ� 2���� �迭 �����Ͻÿ� (���,����,�� ����� ���� Ű����� �Է¹���)
package exampletest;

import java.util.Scanner;

public class Num77 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("�ұ�Ģ�� 2��"
				+ "�� �迭�� ����");
		System.out.print("�� �� : ");
		
		input = sc.nextInt();
		int[][] a = new int[input][];
		for(int i =0; i<a.length;i++) {
			System.out.print(i +"���� ���� : ");
			input = sc.nextInt();
			a[i] = new int[input];
		}
		
		System.out.println("\n�� ����� ���� �Է��մϴ�.");
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print("c["+i+"]["+j+"] :");
				input = sc.nextInt();
				a[i][j] = input;
			}
			System.out.println();
		}
		
		System.out.println("�迭 c�� �� ��� ���� ���");
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
