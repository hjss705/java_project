//int�� �迭�� �� ��ҿ� 1~10�� ������ �����ϰ� ������� ���� ����׷���(��ȣ����*�� ����)��ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
package exampletest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Num65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ҽ� �Է�:");
		int input = sc.nextInt();
		int[] randarr = new int[input];
		for(int i =0; i<input;i++) randarr[i]=(int)(Math.random()*10);
		for(int i=10; i>0; i--) {
			int k=0;
			for(int j =0;j<input;j++) {
				if(randarr[k]<=i) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
				k++;
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i=0; i<input;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println(Arrays.toString(randarr)+"�迭 ���� ��");
		

	}

}
 