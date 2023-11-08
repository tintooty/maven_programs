package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

	ArrayList<String> name = new ArrayList<String>();
	
	public void addElements()
	{
		name.add("Kottayam");
		name.add("Ernakulam");
		name.add("Thrissur");
		name.add("Palakkad");
		name.add("Calicut");
	}
	
	public void itrerateThroughElements()
	{
		Iterator<String> itr = name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		Iterate item = new Iterate();
		item.addElements();
		item.itrerateThroughElements();

	}

}
