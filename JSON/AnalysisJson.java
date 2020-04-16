package JSON;

import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

public class AnalysisJson {
	public static void main(String[] args)throws Exception {
		 Scanner cin=new Scanner(System.in);
		 int n=cin.nextInt();
		 json k=new json();	 
		 JSONObject j=k.inturn(n);
		 System.out.println(j);
		 cin.close();
		}

}
class json{
	public JSONObject inturn(int i)throws Exception{
		JSONObject output = null;
			try {
				String JsonLine="{\"behavior\": [{\"trait_id\": \"behavior_sunday\",\"name\": \"Sunday\",\"category\": \"behavior\",\"percentage\": 0.21392532795156},{\"trait_id\": \"behavior_monday\",\"name\": \"Monday\",\"category\": \"behavior\",\"percentage\": 0.42583249243189},{\"trait_id\": \"behavior_saturday\",\"name\": \"Saturday\",\"category\": \"behavior\",\"percentage\": 0.077699293642785},{\"trait_id\": \"behavior_0000\",\"name\": \"0:00 am\",\"category\": \"behavior\",\"percentage\": 0.4561049445005},{\"trait_id\": \"behavior_0100\",\"name\": \"1:00 am\",\"category\": \"behavior\",\"percentage\": 0.12209889001009},{\"trait_id\": \"behavior_2300\",\"name\": \"11:00 pm\",\"category\": \"behavior\",\"percentage\": 0.12310797174571}]}";				
				JSONObject obj=new JSONObject(JsonLine);								
				for(int o=0;o<(obj.getJSONArray("behavior").length()-1);o++){
					String a=obj.getJSONArray("behavior").getJSONObject(o).getString("percentage").toString();				
					String b=obj.getJSONArray("behavior").getJSONObject(o+1).getString("percentage").toString();
					char[] c=a.toCharArray();
					char[] d=b.toCharArray();
					for(int j=0;j<a.length();j++) {
					if(c[j]<d[j]){
						Object a1=obj.getJSONArray("behavior").getJSONObject(o);
						Object a2=obj.getJSONArray("behavior").getJSONObject(o+1);
						Object a3=null;
						a3=a1; 
						a1=a2;
						a2=a3;
						break;
					}
					}
					
				}
				Object name=obj.getJSONArray("behavior").getJSONObject(i).getString("name");
				Object percentage=obj.getJSONArray("behavior").getJSONObject(i).getString("percentage");
				output=new JSONObject();
				output.put("name",name);
				output.put("percentage",percentage);			
			} 
			catch(JSONException e) {
				e.printStackTrace();
			}
			return output;	
		}
}
