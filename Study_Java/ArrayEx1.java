package arrayex;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int [] odds = {1,3,5,7,9};
				
		System.out.println("# for �ݺ��� ���");
		for(int i=0; i<odds.length; i++) {
			System.out.println("odds[" + i + "] : "  + odds[i]);
			
		}
		
		for(int odd :odds) {
			System.out.print(odd);
		}
		
		System.out.println(); 
//		System.out.println(); //println 2�����
		
		String[] weeks = {"��", "ȭ", "��", "��","��", "��", "��"};
		
		System.out.println("# �ε��� ���");
		System.out.println(weeks[3]);

		System.out.println();
		
		System.out.println("# for �ݺ��� ���");		
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
		System.out.println(); //println 2�����
		
		
		System.out.println("# ������ for �ݺ��� ���");
		for(String day : weeks) {
			System.out.print(day);
		}
		
	}

}
