//키보드로 입력한 정수값이 음이면 "이 값은 음의값입니다."라고표시하는 프로그램을 작성하시오

package exampletest;

import java.util.Scanner;
public class Num12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("입력");
	      int a = sc.nextInt();
	      if(a < 0)
	      {
	         System.out.println("이값은 음의 값");
	      
	      }
	      else
	         System.out.println("이 값은 음의 값이 아니다.");
	      sc.close();
		

	}

}