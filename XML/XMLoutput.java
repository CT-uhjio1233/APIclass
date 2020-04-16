package XML;
import java.io.IOException;
	import org.dom4j.Document;
	import org.dom4j.DocumentHelper;
	import org.dom4j.Element;
	import org.dom4j.io.OutputFormat;
	import org.dom4j.io.XMLWriter;

public class XMLoutput {
		public static void main(String arg[]) throws IOException {
		Document document=DocumentHelper.createDocument();
		Element course1=document.addElement("WebSites");
		
		
		Element Site1=course1.addElement("Site").addAttribute("Name", "Facebook");
		Site1.addElement("DB").addText("MySQL");
		Site1.addElement("FileSystem").addText("Hadoop").addAttribute("DB", "HBase");
		
		Element Site2=course1.addElement("Site").addAttribute("Name", "Yahoo");
		Site2.addElement("DB").addText("Postgres");
		Site2.addElement("FileSystem").addText("SunOS");
		
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter writer=new XMLWriter(System.out,format);
		writer.write(document);
		writer.close();
		
		}
}


