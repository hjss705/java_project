//달 을 정수값으로 입력받아서 해당하는 달의 계쩔을 표시하는 프로그램을 작성하시오. 원하는 만큼 입력 및 출력할수 있게하고, 1~12 이외의 값이 입력되는 경우, 재입력되도록 할 것.
package exampletest;

import java.util.Scanner;

public class Num44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int a = 0;
		
		do {
			System.out.println("원하는 달을 입력하시오 : ");
			b = sc.nextInt();
			
			if (b <= 2) {
				System.out.println("겨울");
				System.out.println("다시입력하시겠습니까? (yes:1 no:2)");
				a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
			}
			
	        else if(b <= 4) {
				System.out.println("봄");
				System.out.println("다시입력하시겠습니까? (yes:1 no:2)");
				a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
			}
	        else if(b <= 9) {
	        	System.out.println("여름");
	        	System.out.println("다시입력하시겠습니까? (yes:1 no:2)");
	        	a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
	        }
	        else if(b <= 10) {
	        	System.out.println("가을");
	        	System.out.println("다시입력하시겠습니까? (yes:1 no:2)");
	        	a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
	        }
	        else if(b <= 12) {
	        	System.out.println("겨울");
	        	System.out.println("다시입력하시겠습니까? (yes:1 no:2)");
	        	a = sc.nextInt();
				if(a == 1) {
					continue;
				}
				else if (a == 2);
					break;
	        }
	        else
	        	System.out.println("다시 ㅡㅡ");
		}while (b > 0);

	}

}
