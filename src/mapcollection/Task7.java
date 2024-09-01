package mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task7 {
	public static void main(String[] args) {
		//Create a userdefine Map and insert the 10 Student details
		
     Map<String,String> h=new HashMap<>();
   	 h.put("Stdid", "78");
   	 h.put("Stdname", "Sridhar");
   	 h.put("stdphone", "8098346102");
   	 h.put("address", "Vellore");
   	 h.put("DOB", "11-08-1994");
   	 h.put("DOJ", "11-08-2023");
   	 h.put("email", "Sridhar@gmail.com");
   	 h.put("gender", "male");
   	 
   	 Set<Entry<String, String>> j = h.entrySet();
   	 for (Entry<String, String> g : j) {
   		 System.out.println("key:"+g.getKey());
   		 System.out.println("Value:"+g.getValue());
		
	}
   	 
	}

}
