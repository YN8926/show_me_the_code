package hz.simplejee.dp.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{

	private SerializableSingleton() {
		System.out.println("singleton is create.");
	}
	
	private static SerializableSingleton instance = new SerializableSingleton();
	
	public SerializableSingleton getInstance() {
		return instance;
	}
	/**
	 * 此方法保证了即使反序列化也只有一个实例
	 * PS:在实现了readResolve()方法后,readObject()已经不起作用，而是直接返回readResolve()方法返回的值
	 * @return
	 */
	private SerializableSingleton readResolve() {
		return instance;
	}
}
