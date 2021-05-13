//업앤다운게임을 만드시오...
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int a = r.nextInt(100)+10;
		
		do {
			System.out.println("10부터 99까지 숫자중 임의의 한숫자를 입력하시오 : ");
			int b = sc.nextInt();
			
			if (b == a) {
				System.out.println("정답입니다.");
			}
			
			else if (b < a){
				System.out.println("더 높은숫자를 입력하시오");
			}
			else{
				System.out.println("더 낮은숫자를 입력하시오");
			}
			
		}while(true);
		
	}

}
