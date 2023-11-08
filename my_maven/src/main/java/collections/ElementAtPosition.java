package collections;

import java.util.ArrayList;
import java.util.Scanner;

//b) Write a Java program to retrieve an element (at a specified index) from a given array list. 
public class ElementAtPosition {
	
	ArrayList<String> str = new ArrayList<String>();
	
	public void addElements()
	{
		str.add("Kottayam");
		str.add("Ernakulam");
		str.add("Thrissur");
		str.add("Palakkad");
		str.add("Calicut");
	}
	
	public void retreiveElement(int position)
	{
		System.out.println("Element at position "+position+" is "+str.get(position) );
	}
	
	public static void main(String[] str)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the position between 0 and 4");
		int index = scr.nextInt();
		ElementAtPosition pos = new ElementAtPosition();
		pos.addElements();
		pos.retreiveElement(index);
		
	}

}
