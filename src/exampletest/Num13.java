//입력받은 정수값을 읽어서 절대값을 구하는 프로그램을 작성하시오
package exampletest;
import java.util.Scanner;

public class Num13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 : ");
		int a = sc.nextInt();
		int b;
		if (a >= 0)
			b = a;
		else
			b= -a;
			System.out.println("절대값은 "+ b +"입니다.");
		

	}

}
