package exampletest;

import java.util.Scanner;

public class Num40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("���庰 ǥ�� ü�� ����ǥ(�ּ�/�ִ�/������)");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("����   ��   ǥ��ü��");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤ�");
		
		for (int i = a; i < b ; i = i+ c) {
			System.out.println(i + "   ��   " + (i-100)*0.9);
		}

		
	}

}
