package whileex;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //scanner ��ü ����
		
		char yn; //yes or no
		int score = 0; //����
		int count = 0; //����
		
		while(true) {
			
			////5���������� ���
			
			for(int i=1; i<=5; i++) { 
				
				
				int a = (int)(Math.random()*99)+1; // 0 ~ 99���� ������ ���� ����
				int b = (int)(Math.random()*99)+1; // 0 ~ 99���� ������ ���� ����
				int total = a + b;
				
				System.out.println("[" + i + "�� ����]:" + a + "+" + b + "=");
				
				int d = sc.nextInt();
				
				if(d == total) {
					System.out.println("�����Դϴ�.");
					count ++; //������ count 1�� ����
					score += 20; //������ score 20�� ����
				} 
				
				 else {
					 System.out.println("�����Դϴ�.");
					 System.out.println("����:" + total);
				 }
			
//				break;
			}
			
				System.out.println("��������: " + count);
				System.out.println("����: " + score);
				System.out.println("�ѹ� �� �Ͻ� �ǰ���? (Y or N)");
				yn = sc.next().charAt(0);
			
				if(yn == 'Y' | yn == 'y') {
				
					continue;
				}
				else {
				
					System.out.println("����");
					
					break; //While�� ����
			
					}
		
	         }

    }
	
}

//�������� �ȵ�...
