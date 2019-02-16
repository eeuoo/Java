package hijava.basic;

public class Students {
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
		return this.name + "(" + this.id + ")" ;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Students lee = new Students(12, "hyunjoo");
		Students kim = new Students(11, "yuna");
		Students park = new Students(13, "yuna");
		
		System.out.println(lee);
		
		System.out.println("kim equals lee = " + lee.equals(kim));
		System.out.println("kim equals part = " + park.equals(kim));
	}
}
