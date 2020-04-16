package XML;

import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
class simpleXML {		
		public static void main(String arg[]){
			
		String xmlstring="<db-connections><connection id=\"1\"><name>Test</name><ip>140.128.87.192</ip><port>8443</port></connection><connection id=\"2\"><name>User</name><ip>140.128.87.191</ip><port>8000</port></connection></db-connections>\r\n" +"\r\n" + "";

		try {
		    Document x = DocumentHelper.parseText(xmlstring);
			List<Element> ele= x.getRootElement().elements();   
			for(int i=0;i<ele.size();i++) {
				System.out.println(ele.get(i).elementTextTrim("ip"));	
				System.out.println(ele.get(i).elementTextTrim("port"));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
}
}

