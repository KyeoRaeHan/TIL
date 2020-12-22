package ifelseex;

import java.util.Scanner;

public class IfelseEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int a;
//		a = sc.nextInt();
//		
//		if(a % 4 == 0) {
//			System.out.println("윤년");
//		}
//		
//		if(a % 4 ==0  && a % 100 == 0 ) {
//			System.out.println("평년");
//		}
//		
//		if(a % 4 == 0 && a % 100 ==0 && a % 400 == 0) {
//			System.out.println("윤년");
//		}
//		
//		else {
//			System.out.println("평년");
//		}
		
		System.out.print("연도를 입력하세요 >");
		int a = sc.nextInt();
		if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}

	}

}
