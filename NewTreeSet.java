package snippet;

import java.util.TreeSet;

public class NewTreeSet
{
	
	
	public static void main(String[] args)
	{
		TreeSet tset=new TreeSet();
		tset.add("1");
		tset.add("3");
		tset.add("4");
		tset.add("2");
		tset.add("7");
		tset.add("8");
		tset.add("5");
		
		System.out.println("lowest value stored is"+tset.first());
		System.out.println("highest value is"+tset.last());
	}

	

}
