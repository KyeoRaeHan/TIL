package classex;

public class CarExample001 {

	public static void main(String[] args) {
		
		//��ü ����
		Car001 car1 = new Car001("�����ڵ���");
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		
		Car001 car2 = new Car001("�����ڵ���", "�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		
		Car001 car3 = new Car001("�����ڵ���", "�ڰ���", "����");
		System.out.println("Car3.company :" + car3.company);
		System.out.println("Car3.company :" + car3.model);
		System.out.println("Car3.company :" + car3.color);
		System.out.println();
		
		Car001 car4 = new Car001("�����ڵ���", "�ý�", "����", 200);
		System.out.println("Car3.company :" + car4.company);
		System.out.println("Car3.company :" + car4.model);
		System.out.println("Car3.company :" + car4.color);
		System.out.println("Car3.company :" + car4.maxSpeed);
	}

}
