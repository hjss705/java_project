//���� �ٸ� ��Ұ� ������ ���� ������ �ʵ��� [6-10] ���α׷��� �����Ͻÿ�.
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("��� �� : ");
		int n = sc.nextInt();
		int[] a = new int [n];
		
		for (int i = 0; i <n; i++) {
			int j;
			do {
				a[i] = 1 + rand.nextInt(10);
				for(j=0; j<i; i++) {
						if( a[j] ==a[i]) {
							count++;
							System.out.print("cnt : " + count);
							break;
						}
				}
			} while( j < i);
		}

	}

}
