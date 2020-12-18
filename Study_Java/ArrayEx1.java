package arrayex;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int [] odds = {1,3,5,7,9};
				
		System.out.println("# for 반복문 사용");
		for(int i=0; i<odds.length; i++) {
			System.out.println("odds[" + i + "] : "  + odds[i]);
			
		}
		
		for(int odd :odds) {
			System.out.print(odd);
		}
		
		System.out.println(); 
//		System.out.println(); //println 2번사용
		
		String[] weeks = {"월", "화", "수", "목","금", "토", "일"};
		
		System.out.println("# 인덱스 사용");
		System.out.println(weeks[3]);

		System.out.println();
		
		System.out.println("# for 반복문 사용");		
		for(int i=0; i<weeks.length; i++) {
			System.out.print(weeks[i] +" ");
		}
		
		System.out.println();
		
		for(int i=0; i<weeks.length; i++) {
			System.out.print(weeks[i] +",");
		}
		
		System.out.println();
		
		for(int i=0; i<weeks.length; i++) {
			System.out.print(weeks[i] + "\t");
		}
		
		System.out.println(); 
		System.out.println(); //println 2번사용
		
		
		System.out.println("# 개선된 for 반복문 사용");
		for(String day : weeks) {
			System.out.print(day);
		}
		
	}

}
