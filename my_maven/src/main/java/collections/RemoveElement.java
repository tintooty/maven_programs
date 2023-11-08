package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {
	
	ArrayList<String> name = new ArrayList<String>();
	
	public void addElements()
	{
		name.add("Kottayam");
		name.add("Ernakulam");
		name.add("Thrissur");
		name.add("Palakkad");
		name.add("Calicut");
	}
	
	public void removeElement(int position)
	{
		System.out.println("Before removing the element in the "+position+ ":" +name );
		name.remove((position-1));
		System.out.println("After removing the element in the "+position+ ":" +name );
	}

	public static void main(String[] args) {
		RemoveElement element = new RemoveElement();
		element.addElements();
		element.removeElement(3);

	}

}
