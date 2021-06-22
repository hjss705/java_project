package exampletest;

import java.util.Scanner;

public class Num85 {
	public static void Season (int a) {
		
		String q = "봄";
		String w = "여름";
		String e = "가을";
		String r = "겨울";
		
		if (a == 3) {
			System.out.println(q);
		}
		if (a == 4) {
			System.out.println(q);
		}
		if (a == 5) {
			System.out.println(q);
		}
		if (a == 6) {
			System.out.println(w);
		}
		if (a == 7) {
			System.out.println(w);
		}
		if (a == 8) {
			System.out.println(w);
		}
		if (a == 9) {
			System.out.println(e);
		}
		if (a == 10) {
			System.out.println(e);
		}
		if (a == 11) {
			System.out.println(e);
		}
		if (a == 12) {
			System.out.println(r);
		}
		if (a == 1) {
			System.out.println(r);
		}
		if (a == 2) {
			System.out.println(r);
		}
		else {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하시오 : ");
		int a = sc.nextInt();
		Season(a);

	}

}
