//�迭�� �Է¹޾� Ư�� ���� ������ ��Ҹ� ã���ÿ� ���й��� ��Ұ� ������ ������ ���� �տ� ��ġ�� ��Ҹ� ã�� ���α׷��� �ۼ��Ͻÿ�.
package exampletest;

import java.util.Scanner;

public class Num69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ��:");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]);
			a[i] = sc.nextInt();
		}
		
		System.out.print("ã�� ���� :");
		int k = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			if(a[0] == k ) {
				break;
		    }	
	    }
		if(k<n) {
			System.out.print("ã�¼��ڴ�"+a[0]+"�� �ֽ��ϴ�.");
		}
		else {
			System.out.print("����");
		}

	}

}
