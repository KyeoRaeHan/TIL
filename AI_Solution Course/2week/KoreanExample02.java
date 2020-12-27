package classex;

public class KoreanExample02 {

	public static void main(String[] args) {
		Korean02 k1 = new Korean02("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean02 k2 = new Korean02("홍길순", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
