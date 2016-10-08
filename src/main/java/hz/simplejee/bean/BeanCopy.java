package hz.simplejee.bean;

public class BeanCopy {

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.setT1("ceshi t1");
		T t = new T();
		t.setT("TTTTTT");
		t.setT1(t1);
		
		
	}
}
