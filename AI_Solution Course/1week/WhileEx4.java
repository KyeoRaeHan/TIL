package whileex;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //scanner 객체 생성
		
		char yn; //yes or no
		int score = 0; //점수
		int count = 0; //갯수
		
		while(true) {
			
			////5번문제까지 출력
			
			for(int i=1; i<=5; i++) { 
				
				
				int a = (int)(Math.random()*99)+1; // 0 ~ 99까지 임의의 정수 생성
				int b = (int)(Math.random()*99)+1; // 0 ~ 99까지 임의의 정수 생성
				int total = a + b;
				
				System.out.println("[" + i + "번 문제]:" + a + "+" + b + "=");
				
				int d = sc.nextInt();
				
				if(d == total) {
					System.out.println("정답입니다.");
					count ++; //맞으면 count 1씩 증가
					score += 20; //맞으면 score 20씩 증가
				} 
				
				 else {
					 System.out.println("오답입니다.");
					 System.out.println("정답:" + total);
				 }
			
//				break;
			}
			
				System.out.println("맞은개수: " + count);
				System.out.println("점수: " + score);
				System.out.println("한번 더 하실 건가요? (Y or N)");
				yn = sc.next().charAt(0);
			
				if(yn == 'Y' | yn == 'y') {
				
					continue;
				}
				else {
				
					System.out.println("종료");
					
					break; //While문 종료
			
					}
		
	         }

    }
	
}
