//�Է��� ������ŭ '*'�� ǥ���ϴ� ������ �����ؼ� 5�� ������ �� �ٲ��ؼ� ǥ���ϴ� ���α׷��� �ۼ�
package exampletest;
import java.util.Scanner;
public class Num41 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("* �� �Է��Ͻÿ� : ");
      int  a = sc.nextInt();

      for(int i = 1; i <= a; i++) {
         System.out.print("*");
         if(i%5 ==0) {
            System.out.println("\n");
         }
      }

   }

}