package exampletest;



import java.util.Scanner;

public class Num80 {
	public static int signOf (int n) {
		
		int sign = 0;
		if (n>0)
				sign = 1;
		else if (n<0)
				sign = -1;
		return sign;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Á¤¼ö x: ");
		int x = sc.nextInt();
		int s = signOf(x);
	    System.out.println(s);
	}

}
