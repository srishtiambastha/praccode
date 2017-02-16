package snippet;

import java.util.HashMap;

public class KeyInHashSet 
{
	
	public static void main(String[] args)
	{
		
		HashMap hmap=new HashMap();
		
		hmap.put("1", "One");
		hmap.put("2", "Two");
		hmap.put("3", "Three");
		
		
		boolean bln=hmap.containsKey("4");
		System.out.println("4 exists in Hashmap?" +bln);
		
		
	}

}
