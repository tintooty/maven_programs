package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
	
ArrayList<String> name = new ArrayList<String>();
	
	public void addElements()
	{
		name.add("Kottayam");
		name.add("Ernakulam");
		name.add("Thrissur");
		name.add("Palakkad");
		name.add("Calicut");
	}
	
	public void searchElement(String element)
	{
		for(int i=0;i<name.size();i++)
		{
			if((name.get(i)).equalsIgnoreCase(element))
			{
				System.out.println("Elemet found! Position "+(i+1));
			}
		}
	}

	public static void main(String[] args) {
		SearchElement element = new SearchElement();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter element to search");
		String searchElement = scr.next();
		element.addElements();
		element.searchElement(searchElement);

	}

}
