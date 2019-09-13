package hijava.license;

public class section_009 {

//	public static void main (String[] args) {
//		int i, j = 0;
//		for(i = 1; i < 8; i++) {
//			j = j + i;
//		}
//		
//		System.out.printf("%d, %d", i, j);
//			
//	}
	
	static class AAclass {
		int i;
		int j;
	}
	
	public static void main(String[] args) {
//		int a[] = new int[5];
//		int i;
//		for (i = 0; i < 5; i++) {
//			a[i] = i + 10;
//		}
//		for(i = 0; i < 5; i++) {
//			System.out.printf("%4d", a[i]);
//		}
		
//		int[] a = {90, 100, 80, 70, 60, 50, 30};
//		int hap = 0;
//		float avg;
//		for(int i : a)
//			hap = hap + i;
//		avg = (float)hap / a.length;
//		System.out.printf("%4d, %4.2f", hap, avg);
		
//		String str = "Information!";
//		int n = str.length();
//		char[] st = new char [n];
//		n--;
//		for(int k = n; k >= 0; k--) {
//			st[n-k] = str.charAt(k);
//		}
//		for(char k : st) {
//			System.out.printf("%c", k);
//		}
		
//		Employee myJik = new Employee();
//		myJik.name = "홍길동";
//		myJik.idNum = 17001;
//		myJik.salary = 4500000;
//		myJik.sex = true;
//		System.out.printf("%s\n", myJik.name);
//		System.out.printf("%d\n", myJik.idNum);
//		System.out.printf("%d\n", myJik.salary);
//		System.out.printf("%b\n", myJik.sex);
		
		AAclass myVal = new AAclass();
		myVal.i = 10;
		myVal.j = 20;
		myVal = change(myVal);
		System.out.printf("i=%d, j=%d\n", myVal.i, myVal.j);
				
	}
	
	static AAclass change(AAclass myVal) {
		int temp;
		temp = myVal.i;
		myVal.i = myVal.j;
		myVal.j = temp;
		return myVal;
	}
	
	
}

class Employee {
	String name;
	int idNum;
	int salary;
	boolean sex;
}
