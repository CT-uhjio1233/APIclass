package JSON;

import org.json.*;
public class JSON_simple_require {
	public static void main (String arg[])throws Exception{
		try {
			JSONArray JsonLine=new JSONArray("[{\"id\": 1,\"first_name\": \"Jeanette\",\"last_name\": \"Penddreth\",\"email\": \"jpenddreth0@census.gov\",\"gender\": \"Female\",\"ip_address\": \"26.58.193.2\"}, {\"id\": 2,\"first_name\": \"Giavani\",\"last_name\": \"Frediani\",\"email\": \"gfrediani1@senate.gov\",\"gender\": \"Male\",\"ip_address\": \"229.179.4.212\"}, {\"id\": 3,\"first_name\": \"Noell\",\"last_name\": \"Bea\",\"email\": \"nbea2@imageshack.us\",\"gender\": \"Female\",\"ip_address\": \"180.66.162.255\"}, {\"id\": 4,\"first_name\": \"Willard\",\"last_name\": \"Valek\",\"email\": \"wvalek3@vk.com\",\"gender\": \"Male\",\"ip_address\": \"67.76.188.26\"}]");
			for(int i=0;i<JsonLine.length();i++) {
				JSONObject jsonin=new JSONObject(JsonLine.getString(i));
				String gender=jsonin.getString("gender");
		    	System.out.print("element"+i+"     ");
		    	System.out.print("gender:"+gender);
		    	int key=gender.compareTo("Female");
		    	if(key==0){
		    		String last_name=jsonin.getString("last_name");
		    		System.out.print("   "+"last_name:"+last_name);
		    	}
		    	System.out.println();
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
