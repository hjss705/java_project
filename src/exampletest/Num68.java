//���� ������ �հ�, ��� , �ְ��� , �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� : ");
		int n = sc.nextInt();
		
		int[] exam = new int[n];
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 100;
		
		
		for(int i = 0; i < exam.length; i++) {
			System.out.print(i+1+"�� ���� :");
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

		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
		System.out.println("�ְ��� : "+max);
		System.out.println("������ : "+min);
		

	}

}
