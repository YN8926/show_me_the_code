package hz.simplejee.bean;

public class T {

	private String t;
	private T1 t1;
	
	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}

	@Override
	public String toString() {
		String s = "T [t=" + t + ", t1=" + t1 + "]";
		return s;
	}
	
}
