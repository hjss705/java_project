//숫자 맞추기 게임에서 숫ㅅ자의 범위를 0부터 99까지 로 변경설정하고 플레이어가 입력할수있는 횟수를 제한하도록 프로그램을 작성하시오 제한 횟수내에 맞추지못하는 경우에는 정답을표시하고 게임을 종료하시오
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int a = r.nextInt(100);
		
	    final int  MAX_NO = 6;
	    
	    int leftNo = MAX_NO;
	    int x;
	    
	    do {
	    	System.out.println("남은횟수"+leftNo--);
	    	System.out.println("예상숫자를 입력 :");
	    	x = sc.nextInt();
	    	
	    	if(x > a) {
	    		System.out.println("더 작은 숫자를 입력하시오");
	    	}
	    	else if(x < a) {
	    		System.out.println("더 높은 숫자를 입력하시오");
	    	}
	    	
	    }while(x != a && leftNo > 0);
	    if(x == a) {
	    	System.out.println((MAX_NO - leftNo)+"회만에 정답");
	    }
	    else
	    	System.out.println("아쉽네요 . 정답은"+a);
	}
}
