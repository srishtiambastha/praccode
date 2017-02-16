package snippet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemovingKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashmap = new HashMap();
		hashmap.put("1", "Sandeep");
		hashmap.put("2", "Rashid");
		hashmap.put("3", "Vishnu");
		hashmap.put("4", "Sreedev");
		hashmap.put("5", "Manoj");
		hashmap.put("6", "Rahul");
		 String key=null;
	      String value="Names";   
	hashmap.put(key,value);
	 Object object = hashmap.remove("4");
    System.out.println(object + " Removed from HashMap");


if(!hashmap.isEmpty()){

Iterator<Entry<String, String>> it=hashmap.entrySet().iterator();
         
while(it.hasNext()){

Map.Entry obj=(Entry) it.next();
System.out.print(obj.getKey()+" ");
System.out.println(obj.getValue());
         
}           
}   
	}
	}
