//���� ���߱� ���ӿ��� �������� ������ 0���� 99���� �� ���漳���ϰ� �÷��̾ �Է��Ҽ��ִ� Ƚ���� �����ϵ��� ���α׷��� �ۼ��Ͻÿ� ���� Ƚ������ ���������ϴ� ��쿡�� ������ǥ���ϰ� ������ �����Ͻÿ�
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
	    	System.out.println("����Ƚ��"+leftNo--);
	    	System.out.println("������ڸ� �Է� :");
	    	x = sc.nextInt();
	    	
	    	if(x > a) {
	    		System.out.println("�� ���� ���ڸ� �Է��Ͻÿ�");
	    	}
	    	else if(x < a) {
	    		System.out.println("�� ���� ���ڸ� �Է��Ͻÿ�");
	    	}
	    	
	    }while(x != a && leftNo > 0);
	    if(x == a) {
	    	System.out.println((MAX_NO - leftNo)+"ȸ���� ����");
	    }
	    else
	    	System.out.println("�ƽ��׿� . ������"+a);
	}
}
