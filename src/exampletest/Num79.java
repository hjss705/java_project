//�н� �� , �� �б��� �л��� , �׸��� ����л��� ������ �о �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �հ�� ����� �б� ������ �������� ������� �ϴ� ���� ���Ͻÿ�.

package exampletest;

import java.util.Scanner;

public class Num79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �ձ��� �л����� �л��� ����� ���ϴ� ���α׷��� �ۼ��غ��ڽ��ϴ�.");
		System.out.print("��ݱ��� �ֽ��ϱ�?");
		int input = sc.nextInt();		
		int[][] a = new int[input][];
		int totNumber = 0;
		
		int summ = 0;
		for(int i = 0; i < a.length;i++) {
			System.out.print(i+1+"���� �л��� :");
			input = sc.nextInt();
			a[i] = new int[input];
		}
		
		System.out.println("�л������� �Է��Ͻÿ� :");
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(i+1+"��"+(j+1)+"�� :");
				input = sc.nextInt();
				a[i][j] = input;
				summ += a[i][j];
			}
			
		}
		System.out.println("-----------���----------");
		System.out.println("��      �հ�      ���");
		int total = 0;
		for(int i = 0; i < a.length;i++) {
			    int sum = 0;
			    for (int j=0; j<a[i].length; j++) {
			    	sum += a[i][j];
			    }
				System.out.println(i+1+"��"+"     "+sum+"      "+(double)sum/a[i].length);
				
		}
		System.out.println("-----------------------");
		System.out.println("��      "+summ+"     "+(double)summ/a.length);
	}

}
