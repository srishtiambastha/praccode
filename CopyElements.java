package snippet;

import java.util.HashSet;

public class CopyElements {

	public static void main(String[] args) 
	{
		
		 int x;
		 HashSet hset=new HashSet();
		 
		 hset.add("Srishti");
		 hset.add("Vidya");
		 hset.add("Rahul");
		 
		 Object[] objArray= hset.toArray();
		 System.out.println("HashSet elements are copied into Array");
		 
		 for(x=0;x<objArray.length;x++)
		 {
			 System.out.println(objArray[x]);
		 }
		 
		 
		

	}

}
