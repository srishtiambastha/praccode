package snippet;

import java.util.HashSet;

public class SizeHashSet 
{
	public static void main(String[] args)
	{
		
		HashSet hset=new HashSet();
		
		System.out.println("size of HashSet is" +hset.size());
		hset.add(1);
		hset.add(2);
		hset.add(3);
		
		
		System.out.println("size after addition is" +hset.size());
		
		
	}
}
