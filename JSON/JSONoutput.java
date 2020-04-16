package JSON;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONoutput {
	public static void main(String[] args)throws Exception {
		try {
			String JsonLine="{\"behavior\": [{\"trait_id\": \"behavior_sunday\",\"name\": \"Sunday\",\"category\": \"behavior\",\"percentage\": 0.21392532795156},{\"trait_id\": \"behavior_monday\",\"name\": \"Monday\",\"category\": \"behavior\",\"percentage\": 0.42583249243189},{\"trait_id\": \"behavior_saturday\",\"name\": \"Saturday\",\"category\": \"behavior\",\"percentage\": 0.077699293642785},{\"trait_id\": \"behavior_0000\",\"name\": \"0:00 am\",\"category\": \"behavior\",\"percentage\": 0.4561049445005},{\"trait_id\": \"behavior_0100\",\"name\": \"1:00 am\",\"category\": \"behavior\",\"percentage\": 0.12209889001009},{\"trait_id\": \"behavior_2300\",\"name\": \"11:00 pm\",\"category\": \"behavior\",\"percentage\": 0.12310797174571}]}";				
			JSONObject obj=new JSONObject(JsonLine);
			for(int i=0;i<obj.getJSONArray("behavior").length();i++) {
			Object name=obj.getJSONArray("behavior").getJSONObject(i).getString("name");
			Object percentage=obj.getJSONArray("behavior").getJSONObject(i).getString("percentage");
			JSONObject output=new JSONObject();
			output.put("name",name);
			output.put("percentage",percentage);
			String out=output.toString();
			System.out.println(out);
			}
		} 
		catch(JSONException e) {
			e.printStackTrace();
		}
	}

}
