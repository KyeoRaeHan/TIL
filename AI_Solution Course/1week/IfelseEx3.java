package ifelseex;

import java.util.Scanner;

public class IfelseEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int a;
//		a = sc.nextInt();
//		
//		if(a % 4 == 0) {
//			System.out.println("����");
//		}
//		
//		if(a % 4 ==0  && a % 100 == 0 ) {
//			System.out.println("���");
//		}
//		
//		if(a % 4 == 0 && a % 100 ==0 && a % 400 == 0) {
//			System.out.println("����");
//		}
//		
//		else {
//			System.out.println("���");
//		}
		
		System.out.print("������ �Է��ϼ��� >");
		int a = sc.nextInt();
		if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
			System.out.println("����");
		}
		else {
			System.out.println("���");
		}

	}

}
