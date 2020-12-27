package classex;

public class CarExample001 {

	public static void main(String[] args) {
		
		//객체 생성
		Car001 car1 = new Car001("현대자동차");
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		
		Car001 car2 = new Car001("현대자동차", "자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		
		Car001 car3 = new Car001("현대자동차", "자가용", "빨강");
		System.out.println("Car3.company :" + car3.company);
		System.out.println("Car3.company :" + car3.model);
		System.out.println("Car3.company :" + car3.color);
		System.out.println();
		
		Car001 car4 = new Car001("현대자동차", "택시", "검정", 200);
		System.out.println("Car3.company :" + car4.company);
		System.out.println("Car3.company :" + car4.model);
		System.out.println("Car3.company :" + car4.color);
		System.out.println("Car3.company :" + car4.maxSpeed);
	}

}
