//����� ���� int���� �迭�� ���� ��� ��ҿ� 1~10 ������ �����Ͻÿ�. (��� ���� Ű����� �Է� ���� ��)
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i =0; i<n; i++) {
			a[i] = 1+rand.nextInt(10);
		}
		for ( int i = 0;i<n;i++) {
			System.out.println("a["+i+"[=");
		}

	}

}
