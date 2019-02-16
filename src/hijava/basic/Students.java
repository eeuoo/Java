package hijava.basic;


public class Students implements Cloneable {
	private int id;
	private String name;

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + "(" + this.id + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		return true;

//		Students other = (Students) obj;
//		return id == other.id && other.name != null && name == other.name;

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Students cloneo = (Students) super.clone();
		cloneo.name = cloneo.name + "복제본";
		return cloneo;
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		StringBuilder sb = new StringBuilder();
		sb.append("aaaa");
		System.out.println("sb1=" + sb.toString());
		sb.setLength(0);
		System.out.println("sb2=" + sb.toString());
		
		
		Students lee = new Students(12, "hyunjoo");
		Students kim1 = new Students(11, "yuna");
		Students kim2 = new Students(11, "yuna");
		Students dong = (Students) lee.clone();

		System.out.println(lee.getClass() + "::::" +  lee.getClass().getName() );
		
		Students s = new Students(921234, "홍길동");
		String ss = new String("홍길동");
		Integer obj = new Integer(s.id);
		Integer obj2 = new Integer(921234);

		System.out.println(s.name.hashCode() + "::" + ss.hashCode());
		System.out.println(obj.hashCode() + "=" + obj2.hashCode());
		System.out.println(System.identityHashCode(obj2));

		System.out.println("kim1 equals lee = " + lee.equals(kim1));
		System.out.println("kim1 equals kim2 = " + kim2.equals(kim1));
		
		System.out.println(dong);
		
		
	}
}
