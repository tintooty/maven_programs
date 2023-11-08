package abstractexample.google;

public class TextSearch extends Google
{
	
	public void textSearch()
	{
		System.out.println("Text Search-----");
	}

	public void search() 
	{
		System.out.println("Search an item with text");
	}

	public void seachAll() 
	{
		System.out.println("Search all items with text");
	}
	
	public static void main(String[] str)
	{
		TextSearch text = new TextSearch();
		text.welcome();
		text.textSearch();
		text.search();
		text.seachAll();
	}

}
