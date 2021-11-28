
public class FileProcessorTester 
{
	public static void main(String[] args) 
	{
		FileProcessor good = new FileProcessor("GoodString.txt", 0);
		good.processFile();
		
		//using a for loop to iterate trough my list to see all the String elements that were added, notice that I pass O in the constructor,
		//but the setStringLength(int stringLength) will set it to 5.
		for (String strings : good.getArrayList())
			System.out.println(strings);
		
		System.out.println("printing the size of the array: "+good.getArrayListSize());
	}//end main
}
