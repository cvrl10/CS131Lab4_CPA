public class BadString
{
  public static void main(String[] args)
  {
    	FileProcessor fp = new FileProcessor("BadString.txt", 10);
		fp.processFile(); 
		
		/*Using a for loop to iterate trough my list to see all the String elements that were added, all the Strings length should be 10 or fewer,
		because an exception is thrown when a string.length() > 10 and that's when I stop adding elements to my ArrayList<String>*/
		for (String strings : fp.getArrayList())
			System.out.println(strings);
		
		System.out.println("printing the size of the array: "+fp.getArrayListSize());
  }//end main  
}//end class