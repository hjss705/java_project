package exampletest;

import java.util.Scanner;

public class Num38 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�������� �Է��Ͻÿ� :");
	int a = sc.nextInt();
	int sum = 0;
	
	for(int b = 1; a >= b; b++) {
		sum += b;
	}
	System.out.println(sum);
  }
	

}
