package classex;

public class Car001 {

	//필드
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car001(String company) {
		this.company = company;
	}
	
	Car001(String company, String model){
		this.company = company;
		this.model = model;
	}
	
	Car001(String company, String model, String color){
		this.company = company;
		this.model = model;
		this.color = color;
	}	
	
	Car001(String company, String model, String color, int maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}	

}
