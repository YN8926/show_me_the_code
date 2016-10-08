package hz.simplejee.excel.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import hz.simplejee.utils.ResourcesUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class HelloMain {

	public static void main(String[] args) throws Exception{
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet();
		String path = ResourcesUtils.getClassDir(HelloMain.class) + "temp/hello.xsl";
		System.out.println(path);
		OutputStream os = new FileOutputStream(new File(path));
		wb.write(os);
		
	}
}
