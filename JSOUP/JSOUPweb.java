package JSOUP;

import org.jsoup.Jsoup;
class testjsoup {
	public  String GetWeb_con (String UI)throws Exception{
		String JS=null;
		try {
			JS = Jsoup.connect(UI).ignoreContentType(true).execute().body();
		}
		catch (Exception e) {
			e.printStackTrace();   
		}
		return JS;
	}
}

public class JSOUPweb {
	public static void main(String[] args) throws Exception{
		try {
			String webcon="http://140.128.87.192/ws/csv_sample_3.html";
			testjsoup out=new testjsoup();
			String output=out.GetWeb_con(webcon);
			String SpOutput[]=output.split("\n");
			for(String element:SpOutput) {
			 	System.out.println(element);
			}
		}
		catch (Exception e) {
			e.printStackTrace();   
		}	
    }
   
}