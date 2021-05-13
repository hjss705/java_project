package exampletest;

import java.util.Scanner;

public class Num40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("신장별 표준 체중 대응표(최소/최대/증가값)");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("신장   ㅣ   표준체중");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for (int i = a; i < b ; i = i+ c) {
			System.out.println(i + "   ㅣ   " + (i-100)*0.9);
		}

		
	}

}
