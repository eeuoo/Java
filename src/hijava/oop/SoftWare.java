package hijava.oop;

public abstract class SoftWare {
	
	public abstract void plan();
	public abstract void develope();
	public abstract void release();

	//보통 private, public 생략하고 void만 쓴다.
	void work() {
		plan();
		develope();
		release();
	}

}
