//5개의 정수로 구성된 그룹의 전체 합계(그룹별 합계 아닌 전체 그룹의 합)를 구하는 프로그램을 작성하시오
//전체 10개의 그룹이 있으며 각 정수값은 키보드로 입력한다. 이 떄 , 99999를 입력하면 전체입력 종료하고 88888을 입력하면 현재 읽고있는 그룹의 입력을 종료하시오.
package exampletest;

import java.util.Scanner;

public class Num50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		out:for(int i = 1; i <= 10; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.println(i+"그룹"+j+"뻔재 정수 입력:");
				input = sc.nextInt();
				if(input == 88888) {
					break;
				}
				else if(input == 99999) {
					break out;
				}
				sum += input;
			}
			
		}
		System.out.println("총합은 :"+sum);

	}

}
