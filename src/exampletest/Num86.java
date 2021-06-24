//문자 c를 n개 표시하는 putChar 메서드와 이 메서드를 내부에서 호출에 문자 *을 개 호출하는 putStart를 작성하시오
package exampletest;

import java.util.Scanner;


public class Num86 {
	public static String putChar(int n) {
		String charc = "";
		for(int i =0;i<n;i++) {
			charc += "c";
		}
		return charc;
	}
	
	public static void putStars(int n) {
		for(int i =0;i<putChar(n).length();i++) {
			for(int j = 0;j<putChar(n).length();j++) {
				if(j<=i) {
					System.out.println("*");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수를 적으시오 :");
		int a = sc.nextInt();
		putStars(a);
	}
}