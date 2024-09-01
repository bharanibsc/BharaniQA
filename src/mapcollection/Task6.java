package mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task6 {
         public static void main(String[] args) {
        	 //Create a userdefine Map and insert the 10 employee details
        	 Map<String,String> h=new HashMap<>();
        	 h.put("empid", "78282");
        	 h.put("name", "Bharani");
        	 h.put("phone", "8098466102");
        	 h.put("address", "Vellore");
        	 h.put("DOB", "11-08-1992");
        	 h.put("DOJ", "6-08-2023");
        	 h.put("email", "bharani@gmail.com");
        	 h.put("gender", "male");
        	 h.put("sal", "600000");
        	 
        	 Set<Entry<String, String>> u = h.entrySet();
        	 for (Entry<String, String> y : u) {
        		 System.out.println("Key:"+y.getKey());
        		 System.out.println("Values:"+y.getValue());
				
			}
        	 
         }
}
