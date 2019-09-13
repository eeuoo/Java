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
	
	public static void main(String[] args) {
//		int a[] = new int[5];
//		int i;
//		for (i = 0; i < 5; i++) {
//			a[i] = i + 10;
//		}
//		for(i = 0; i < 5; i++) {
//			System.out.printf("%4d", a[i]);
//		}
		
		int[] a = {90, 100, 80, 70, 60, 50, 30};
		int hap = 0;
		float avg;
		for(int i : a)
			hap = hap + i;
		avg = (float)hap / a.length;
		System.out.printf("%4d, %4.2f", hap, avg);
	}
	
	
	
}
