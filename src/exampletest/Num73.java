// �ش� ������ ���� �ܾ �Է��Ͻÿ�.
package exampletest;

import java.util.Scanner;
import java.util.Random;

public class Num73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String[] dayKorean = {"��","ȭ","��","��","��","��"};
		String[] dayEnglish = {"sunday","monday","tuesday","wendesday","thursday","friday","saturday"};
		
		System.out.println("�ش� ������ ���ܾ �Է��Ͻÿ�.");
		
		int day;
		int retry = 0;
		int last = -1;
		
		do {
			do {
				day = rand.nextInt(7);
			} while(day == last);
			last = day;
		
			while(true) {
				System.out.print(dayKorean[0] +"���� : ");
				
				String answer = sc.next();
				
				if (answer.equals(dayEnglish[day])) {
					System.out.println("����");
					break;
				}
				else {
					System.out.println("�����Դϴ�.");
				}
			}
			
			System.out.print("�ٽ��ѹ�?(yes:1, no:0): ");
			retry = sc.nextInt();
			
		}while(retry  == 1);
		
		
		

	}

}
 