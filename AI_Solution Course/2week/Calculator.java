package methodex;

public class Calculator {

		//�ʵ�
		// ������
		// �޼ҵ�
		
		void powerOn() {
			System.out.println("������ �մϴ�.");
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
			System.out.println("������ ���ϴ�.");
		}
	}
