package methodex;

public class Calculatorexample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		System.out.println("------------------");
		
		System.out.println("result1: " + cal.plus(5,6));
		System.out.println("result1: " + cal.divide(10,4));
		
		System.out.println("------------------");
		
		cal.powerOff();

	}

}
