//2���� ���� �������� �о , ���ڰ� ������ ����̸� "B�� a�� ����̴ٶ�� ǥ���ϰ� 
//�׷���������B��a�� ������ƴϴ� ��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�

package exampletest;

import java.util.Scanner;
public class Num14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� A :");
		int a = sc.nextInt();
		System.out.print("���� B :");
		int b = sc.nextInt();
		
		if( a % b == 0)
			System.out.print("B�� A�� ����Դϴ�");
		else
			System.out.print("B�� A�� ������ƴմϴ�");
		sc.close();
    }
}
