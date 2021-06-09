//int형 배열의 각 요소에 1~10의 난수를 대입하고 각요소의 값을 막대그래프(기호문자*을 나열)로표시하는 프로그램을 작성하시오.
package exampletest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Num65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수 입력:");
		int input = sc.nextInt();
		int[] randarr = new int[input];
		for(int i =0; i<input;i++) randarr[i]=(int)(Math.random()*10);
		for(int i=10; i>0; i--) {
			int k=0;
			for(int j =0;j<input;j++) {
				if(randarr[k]<=i) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
				k++;
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i=0; i<input;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println(Arrays.toString(randarr)+"배열 난수 값");
		

	}

}
 