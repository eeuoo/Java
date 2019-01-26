package hijava.practice;

public class Student {

	private String studentNo;
	private String name;
	private int age;
	private String tel;
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		if ( tel == null || tel.length() < 4) {
			return tel;
		}
		else {  
			return tel.substring(0, (tel.length()- 4 ) ) + "****";
		}
		
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	

	}
