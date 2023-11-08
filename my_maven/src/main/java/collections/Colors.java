package collections;

import java.util.ArrayList;

//a) Write a Java program to create a new array list, add some colors (string) and print out the collection. 

public class Colors {
	
	ArrayList<String> color = new ArrayList<String>();
	//add colors
	public void addColors()
	{
	color.add("Red");
	color.add("Blue");
	color.add("Black");
	color.add("Green");
	}
	
	public void printColors()
	{
		for(int i=0;i<color.size();i++)
		{
			System.out.println(color.get(i));
		}
	}
	

	public static void main(String[] args) {
		Colors col = new Colors();
		col.addColors();
		col.printColors();

	}

}
