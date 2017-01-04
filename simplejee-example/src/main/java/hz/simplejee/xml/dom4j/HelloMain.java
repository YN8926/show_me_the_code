package hz.simplejee.xml.dom4j;

import java.util.List;

import hz.simplejee.utils.ResourcesUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class HelloMain {

	public static void main(String[] args) throws Exception{
		SAXReader sax = new SAXReader();
		Document doc = sax.read(ResourcesUtils.getClassDir(HelloMain.class) + "/hello.xml");
		List<Element> nodes = doc.selectNodes("/cfg/manufacturer");
		for(Element e:nodes){
			Element zhName = (Element)e.selectSingleNode("lang[@name='zh']");
			Element enName = (Element)e.selectSingleNode("lang[@name='en']");
			System.out.println("解析目录:" + e.attributeValue("dir") + 
					"-->" + zhName.attributeValue("value") +
					"-" + enName.attributeValue("value"));
		}
	}
}
