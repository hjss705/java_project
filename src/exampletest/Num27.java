//0,1,2 �ϳ��� ������ �����ؼ� 0�̸� ���� 1�̸� ���� 2�̸麸��ǥ���ϴ� ���α׷����ۼ��Ͻÿ�
package exampletest;

import java.util.Random;

public class Num27 {
	public static void main(String[] args) {
		int a = 0;
		
		Random r = new Random();
		a = r.nextInt(3);
		System.out.print(a);
		
		if (a == 0) {
			System.out.println("����");
		}
		else if (a == 1) {
			System.out.println("����");
		}
		else if(a == 2){
			System.out.println("��");
		}
	}

}
