/*���� ���α׷��� �ۼ��ϼ���.
 0.0 �̻� 1.0�̸��� �Ǽ����� �������� �����ؼ� ǥ��
 0.0 �̻� 10.0�̸��� �Ǽ����� �������� �����ؼ� ǥ��
 -1.0�̻� 1.0�̸��� �Ǽ����� �������� �����ؼ� ǥ��
 */
package exampletest;

import java.util.Random;

public class Num8 {

	public static void main(String[] args) {
		Random rand = new Random();
		double x1 = rand.nextDouble();
		System.out.println(x1);
		
		double x2 = rand.nextDouble() * 10;
		System.out.println(x2);
		
		double x3 = -1 + 2 * rand.nextDouble();
		System.out.println(x3);
	}

}
