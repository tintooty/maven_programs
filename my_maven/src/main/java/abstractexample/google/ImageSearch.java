package abstractexample.google;

public class ImageSearch extends Google{
	
	public void imageSearch()
	{
		System.out.println("Image Search---------");
	}
	public void search() 
	{
		System.out.println("Search an item with image");	
	}
	public void seachAll() 
	{
		System.out.println("Search all items with image");
	}
	
	public static void main(String[] str)
	{
		ImageSearch image = new ImageSearch();
		image.welcome();
		image.imageSearch();
		image.search();
		image.seachAll();
	}
	

}
