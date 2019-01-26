package hijava.practice;

public class Score {

	private String Subject;
	private int score;
	public String prof;

	public Score() {  } // 디폴트 생성자
	
	public Score(String subject, int score) {
		this.Subject = subject;
		this.score = score;
	} // 생성자


	public Score(String subject) {
		this.Subject = subject;
	} // 생성자

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
		this.Subject = "과목은???" + subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [Subject=" + Subject + ", score=" + score + "]";
	}

}
