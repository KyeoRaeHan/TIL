package methodex;

public class Calculator {

		//필드
		// 생성자
		// 메소드
		
		void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		
		int plus(int x, int y) {
			int sum = x+y;
			return sum;

		}
		
		int minus(int x, int y) {
			int sum = x-y;
			return sum;
		}
		
		int multiple(int x, int y) {
			int result = x*y;
			return result;
		}
		
		double divide(double x, double y) {
			double result = x/y;
			return result;
		}
		
		double avg(int x, int y) {
			double sum = plus(x,y);
			double result = sum/2 ;
			return result;
		}
		
		void powerOff() {
			System.out.println("전원을 끕니다.");
		}
	}
