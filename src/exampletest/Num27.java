//0,1,2 하나의 난수를 생성해서 0이면 가위 1이면 바위 2이면보를표시하는 프로그램을작성하시오
package exampletest;

import java.util.Random;

public class Num27 {
	public static void main(String[] args) {
		int a = 0;
		
		Random r = new Random();
		a = r.nextInt(3);
		System.out.print(a);
		
		if (a == 0) {
			System.out.println("가위");
		}
		else if (a == 1) {
			System.out.println("바위");
		}
		else if(a == 2){
			System.out.println("보");
		}
	}

}
