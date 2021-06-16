// 해당 요일의 영어 단어를 입력하시오.
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String[] dayKorean = {"일","화","수","목","금","토"};
		String[] dayEnglish = {"sunday","monday","tuesday","wendesday","thursday","friday","saturday"};
		
		System.out.println("해당 요일의 영단어를 입력하시오.");
		
		int day;
		int retry = 0;
		int last = -1;
		
		do {
			do {
				day = rand.nextInt(7);
			} while(day == last);
			last = day;
		
			while(true) {
				System.out.print(dayKorean[0] +"요일 : ");
				
				String answer = sc.next();
				
				if (answer.equals(dayEnglish[day])) {
					System.out.println("정답");
					break;
				}
				else {
					System.out.println("오답입니다.");
				}
			}
			
			System.out.print("다시한번?(yes:1, no:0): ");
			retry = sc.nextInt();
			
		}while(retry  == 1);
		
		
		

	}

}
 