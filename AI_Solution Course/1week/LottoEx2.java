package Lotto;

import java.util.Random;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		System.out.println(">> Lotto Program");
		
		while(true) {
			System.out.println("1 ~ 99 사이의 숫자 6개를 입력하세요");
			System.out.println(">");
			int arr[] = new int[6]; //배열 객체 생성
			
			Scanner sc = new Scanner(System.in); //scanner 객체 생성
			
			for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			if(arr[i] >0 && arr[i]<=99) {
				
				
			} else {
				System.out.println("다시 입력해 주세요");
				i--; //for문의 i++ 완화
			}
			
			
			//중복 숫자가 나오지 않게 
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복입니다");
					i--; // 다시 실행되도록 1감소
				}
				
				//오름차순
				
				if(arr[i] < arr[j]) { 
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			 }
	      }		
			
			
			for(int i=0; i<arr.length; i++) {
				System.out.print("당신이 입력한 숫자는: ");
				System.out.print(arr[i] + " ");
			}
					
			Random ram = new Random(); //random 객체생성
			int comarr[] = new int[6]; // 선택번호 6개가 저장 될 배열 객체 생성
			for(int i =0; i<comarr.length; i++) {
				comarr[i] = ram.nextInt(99)+1; // 0~99까지의 랜덤한 수 생성
				for(int j=0; j<i; j++ ) {
					if(comarr[i] == comarr[j]) {
						i--; //다시 실행되도록 1감소
					}
				}
				
				// 오름차순
			for(int j=0; j<comarr.length; j++) {
				if(comarr[i] < comarr[j]) {
					int temp = comarr[i];
					comarr[i] = comarr[j];
					comarr[j] = temp;
				}
			}
			
		}
		System.out.print("로또 당첨 번호는 : ");
		for(int i=0; i<comarr.length; i++) {
			System.out.print(comarr[i]+" ");
		}
		System.out.println();
		
		
		
		//번호 일치 갯수에 따른 등수 출력
		int cons = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(arr[i]==comarr[j]) {
					cons++;
				}
			
		    }
		}
		
		if(cons == 6) {
			System.out.println("1등!!");
		}
		
		else if(cons == 5) {
			System.out.println("2등!!");
		}
		
		else if(cons == 4) {
			System.out.println("3등!!");
		}
		
		else if(cons == 3) {
			System.out.println("4등!!");
		}
		
		else if(cons == 2) {
			System.out.println("5등!!");
		}
		
		else if(cons == 1) {
			System.out.println("6등!!");
		}
		
		else if(cons == 0) {
			System.out.println("꼴등!!");
		} else {
			System.err.println("오류!!!"); //error메시지를 콘솔에 빨간색 폰트로 표시
		}
		
		System.out.println("계속 진행하시겠습니까? (Y/N)");
		char yn = sc.next().charAt(0);
		
		if(yn == 'y' | yn == 'Y') {
			System.out.println(">> 계속진행하겠습니다.");
			continue;
		} else if(yn == 'n' | yn == 'N') {
			System.out.println("프로그램을 종료합니다");
			System.exit(0); //정상종료
		} else {
			System.out.println("다시 입력해주세요!!");
			yn = sc.next().charAt(0);
		}
			
			
			
		}

	}


}
