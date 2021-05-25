//float 형의 변수를 0.0부터 1.0까지 0.001씩 증가시키며 표시하고, 그옆에 int형 변수를 0부터 1000까지 1씩 증가시키며 1000으로 나눈값을 표시하시오.
package exampletest;

import java.util.Scanner;

public class Num59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		System.out.println("float           int");
		for(double i = 0; i <=1; i =i+0.001) {
			double k = a/1000.0;
			System.out.printf("%,7f %5.7f\n" , i,k);
			a++;
		}

	}

}
