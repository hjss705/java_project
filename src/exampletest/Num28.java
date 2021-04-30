package exampletest;

import java.util.Scanner;

public class Num28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하시오 : ");
		int a = sc.nextInt();
		
		switch (a) {
		case 1 : System.out.println("겨울");break;
		case 2 : System.out.println("겨울");break;
		case 3 : System.out.println("겨울");break;
		case 4 : System.out.println("봄");break;
		case 5 : System.out.println("여름");break;
		case 6 : System.out.println("여름");break;
		case 7 : System.out.println("여름");break;
		case 8 : System.out.println("여름");break;
		case 9 : System.out.println("여름");break;
		case 10 : System.out.println("가을");break;
		case 11 : System.out.println("겨울");break;
		case 12 : System.out.println("겨울");break;
		default: System.out.println("월을 넣으십시오!!! 13월이상부턴 없습니다!");
			break;
		
		
		}
	}

}
