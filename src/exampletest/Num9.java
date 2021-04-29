//키보드로 입력한 성과 이름으로 인사하는 프로그램을 작성해 보세요.

package exampletest;

import java.util.Scanner;

public class Num9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요 :");
		System.out.println("안녕하세요." +sc.next()+"님");
		sc.close();

	}

}

