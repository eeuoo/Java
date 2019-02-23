package hijava.basic;

public class Outer {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.setName("hong");
		System.out.println("o.name= " + o.getName());
		o.callIn();
		
		StaticInner.in();
		
	}
	
	
	private int id;
	private String name;

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void callIn() {
		Inner inner = new Inner();
		inner.in();
	}

	public class Inner {
		public void in() {
			System.out.println("in inner class >> " + name);
		}
	}
	
	static class StaticInner{
		static String inStr = "Static Inner instr";
		public static void in() {
			System.out.println("static inner class >> " + inStr);
		}
		
	}

}
