package XML;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import org.dom4j.Document;
	import org.dom4j.DocumentException;
	import org.dom4j.DocumentHelper;
	import org.dom4j.Element;
	import org.jsoup.*;

public class XMLanalysis {
		
		public static void main(String arg[]) throws IOException{
			Scanner cin=new Scanner(System.in);
			String xmlweb="http://140.128.87.192/xmlExample/book.xml";
			String js=Jsoup.connect(xmlweb).ignoreContentType(true).execute().body();		
			try {
				Document file=DocumentHelper.parseText(js);
				List<Element> ele=file.getRootElement().elements();			
				ArrayList<Float> al = new ArrayList<Float>();	
				for(int i=0;i<ele.size();i++) {
				al.add(Float.parseFloat(ele.get(i).elementTextTrim("price")));
				}
				String[] output=new String[ele.size()];
				Collections.sort(al);
				for(int i=0;i<ele.size();i++) {
					for(int j=0;j<ele.size();j++) {
						if(Float.parseFloat(ele.get(j).elementTextTrim("price"))==al.get(i)){
							output[i]=ele.get(j).elementTextTrim("title");
						}
					}
				}
				
			    
			    System.out.println("Please input a number:");
			    int number=cin.nextInt();
			    System.out.println(al);
			    System.out.println(output[number]);
			}catch (DocumentException e) {
				e.printStackTrace();
            }
            cin.close();
		}
	}


