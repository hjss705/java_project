//�迭�� ��� ���� ���� ����� ���� �Է¹޾Ƽ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(ǥ�������� �迭 �ʱⰪ�� ���� ��������, �� ����� ���� ��ǥ�� �����ϰ�{}�� �������·�
package exampletest;

import java.util.Scanner;

public class Num67 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ҽ� : ");
		
		int n = sc.nextInt();
		
		
		int[] a = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = sc.nextInt();
		}
		System.out.print("a = {");
		if(n >= 2) {
			for(int i =0; i <n-1; i++) {
				System.out.print(a[i]);
				System.out.print(",");
		}
		if (n >= 1) {
			System.out.print(a[n-1]);
		}
		System.out.print("}");	
		}
		
	}

}
  