package hijava.oop;

public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("야옹");

	}

	public static void main(String[] args) {
		Cat remi = new Cat();

//		System.out.println(remi);

		String str = new String("Cat");
		Integer i = new Integer(111);

		System.out.println(str.hashCode());
		System.out.println(i.hashCode());

		boolean hasCondition = true;
		String searchStr = "홍길동";
		String s = "select * from Tbl";
		if (hasCondition) {
			s = s + " where name like '%" + searchStr + "%";
			s += " and id > 0";
			s += " limit 10";
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("select * from Tbl");
		if (hasCondition) {
			sb.append(" where name like '%").append(searchStr).append("%");
			sb.append(100).append('T');
		}
	}
}
