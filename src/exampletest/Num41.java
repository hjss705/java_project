//입력한 개수만큼 '*'을 표시하는 문제를 변경해서 5개 단위로 줄 바꿈해서 표시하는 프로그램을 작성
package exampletest;
import java.util.Scanner;
public class Num41 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("* 을 입력하시오 : ");
      int  a = sc.nextInt();

      for(int i = 1; i <= a; i++) {
         System.out.print("*");
         if(i%5 ==0) {
            System.out.println("\n");
         }
      }

   }

}