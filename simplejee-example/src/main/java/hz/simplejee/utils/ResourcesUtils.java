package hz.simplejee.utils;

public class ResourcesUtils {

	public static String getRootClassDir(Class<?> clazz){
		return clazz.getResource("/").getPath();
	}
	
	public static String getClassDir(Class<?> clazz) {
		return clazz.getResource(".").getPath();
	}
}
