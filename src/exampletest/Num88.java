//������ �¿�� ����Ʈ�� ���� , '���� x2 �� �ŵ�����'�� ����/2�� �ŵ������� ������ Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�
package exampletest;

import java.util.Scanner;

public class Num88 {

	   public static int pow2(int x,int n) {
		      int result = x;
		      for (int i = 1; i < n; i++) {
		         result *= x; 
		      }
		      return result;
		   }

		   public static void main(String[] args) {
		      Scanner stdIn = new Scanner(System.in);
		      
		      System.out.print("���� �� �Է� : ");
		      int x = stdIn.nextInt();
		      System.out.print("���� �� �Է� : ");
		      int n = stdIn.nextInt();
		      
		      int a = x * pow2(x, n);
		      int b = x / pow2(x, n);
		      int c = x << 3;
		      int d = x >> 3;
		      
		      if (a == c) {
		         System.out.print("a �� c ���� ��ġ�մϴ�.");
		         System.out.println();
		      }
		      if (b == d) {
		         System.out.print("b �� d ���� ��ġ�մϴ�.");
		      }
		   }

		}