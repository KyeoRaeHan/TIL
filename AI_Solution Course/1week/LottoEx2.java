package Lotto;

import java.util.Random;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		System.out.println(">> Lotto Program");
		
		while(true) {
			System.out.println("1 ~ 99 ������ ���� 6���� �Է��ϼ���");
			System.out.println(">");
			int arr[] = new int[6]; //�迭 ��ü ����
			
			Scanner sc = new Scanner(System.in); //scanner ��ü ����
			
			for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			if(arr[i] >0 && arr[i]<=99) {
				
				
			} else {
				System.out.println("�ٽ� �Է��� �ּ���");
				i--; //for���� i++ ��ȭ
			}
			
			
			//�ߺ� ���ڰ� ������ �ʰ� 
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("�ߺ��Դϴ�");
					i--; // �ٽ� ����ǵ��� 1����
				}
				
				//��������
				
				if(arr[i] < arr[j]) { 
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			 }
	      }		
			
			
			for(int i=0; i<arr.length; i++) {
				System.out.print("����� �Է��� ���ڴ�: ");
				System.out.print(arr[i] + " ");
			}
					
			Random ram = new Random(); //random ��ü����
			int comarr[] = new int[6]; // ���ù�ȣ 6���� ���� �� �迭 ��ü ����
			for(int i =0; i<comarr.length; i++) {
				comarr[i] = ram.nextInt(99)+1; // 0~99������ ������ �� ����
				for(int j=0; j<i; j++ ) {
					if(comarr[i] == comarr[j]) {
						i--; //�ٽ� ����ǵ��� 1����
					}
				}
				
				// ��������
			for(int j=0; j<comarr.length; j++) {
				if(comarr[i] < comarr[j]) {
					int temp = comarr[i];
					comarr[i] = comarr[j];
					comarr[j] = temp;
				}
			}
			
		}
		System.out.print("�ζ� ��÷ ��ȣ�� : ");
		for(int i=0; i<comarr.length; i++) {
			System.out.print(comarr[i]+" ");
		}
		System.out.println();
		
		
		
		//��ȣ ��ġ ������ ���� ��� ���
		int cons = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(arr[i]==comarr[j]) {
					cons++;
				}
			
		    }
		}
		
		if(cons == 6) {
			System.out.println("1��!!");
		}
		
		else if(cons == 5) {
			System.out.println("2��!!");
		}
		
		else if(cons == 4) {
			System.out.println("3��!!");
		}
		
		else if(cons == 3) {
			System.out.println("4��!!");
		}
		
		else if(cons == 2) {
			System.out.println("5��!!");
		}
		
		else if(cons == 1) {
			System.out.println("6��!!");
		}
		
		else if(cons == 0) {
			System.out.println("�õ�!!");
		} else {
			System.err.println("����!!!"); //error�޽����� �ֿܼ� ������ ��Ʈ�� ǥ��
		}
		
		System.out.println("��� �����Ͻðڽ��ϱ�? (Y/N)");
		char yn = sc.next().charAt(0);
		
		if(yn == 'y' | yn == 'Y') {
			System.out.println(">> ��������ϰڽ��ϴ�.");
			continue;
		} else if(yn == 'n' | yn == 'N') {
			System.out.println("���α׷��� �����մϴ�");
			System.exit(0); //��������
		} else {
			System.out.println("�ٽ� �Է����ּ���!!");
			yn = sc.next().charAt(0);
		}
			
			
			
		}

	}

}
