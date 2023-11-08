package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectioneExample {
	
	ArrayList<String> ls = new ArrayList<String>();
	
	public void listOperations()
	{
		//add items to list
		ls.add("Pinku");
		ls.add("Saroo");
		ls.add("Tintu");
		ls.add("Tintu");//can have duplicate values
		ls.add("");//can have null values
		System.out.println("Arraylist before sorting"+ls);
		
		ls.remove(4);
		System.out.println("After removing 4th item"+ls);
		
		System.out.println("Iterating through array list : for loop");
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
		System.out.println("Itreation through array list : for each");
		for(String name : ls)
		{
			System.out.println(name);
		
		}
		
		System.out.println("Iteration through arraylist : Iterator");
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
	CollectioneExample collect = new CollectioneExample();
	collect.listOperations();

	}

}
