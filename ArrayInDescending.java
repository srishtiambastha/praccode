package snippet;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayInDescending {

	public static void main(String[] args) 
	{
		
		ArrayList<String> arrl=new ArrayList<String>();
		arrl.add("vidya");
		arrl.add("rahul");
		arrl.add("harish");
		arrl.add("poornima");
		
		System.out.println("before sorting");
		
		for(String str:arrl)
		{
			System.out.println(str);
		
		}
		Collections.sort(arrl, Collections.reverseOrder());
		
		System.out.println("After sorting");
		for(String str:arrl)
		{
			System.out.println(str);
		}
		
		
	}

}
