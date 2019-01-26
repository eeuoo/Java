package hijava.practice;

public class School {

	public static void main(String[] args) {
		
		Score Korean = new Score(); 
		
		Korean.setSubject("국어");
		Korean.setScore(90);
		Korean.prof = "코뿔소";
		System.out.println(Korean);
		
		Score math = new Score("수학", 100);
		System.out.println(math);
		
		Score science = new Score ("과학");
		System.out.println(science);
		
	}

}
