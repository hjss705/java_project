//���� c�� n�� ǥ���ϴ� putChar �޼���� �� �޼��带 ���ο��� ȣ�⿡ ���� *�� �� ȣ���ϴ� putStart�� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;


public class Num86 {
	public static String putChar(int n) {
		String charc = "";
		for(int i =0;i<n;i++) {
			charc += "c";
		}
		return charc;
	}
	
	public static void putStars(int n) {
		for(int i =0;i<putChar(n).length();i++) {
			for(int j = 0;j<putChar(n).length();j++) {
				if(j<=i) {
					System.out.println("*");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ��� �����ÿ� :");
		int a = sc.nextInt();
		putStars(a);
	}
}