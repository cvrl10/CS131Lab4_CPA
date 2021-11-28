import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program reads a file of strings and writes them to built-in Java ArrayList
 * 
 * @author carla
 * @version 1.0
 * Programming Lab 4
 * Fall 2021
 */
public class FileProcessor 
{
	private String fileName;//This string represents the name of the file from which the strings will be read
	private int stringLength;//The maximum length for the strings, if Strings are longer than the set length an exception will be thrown
	private ArrayList<String> stringList;//The List collection from which Strings will be added
	private Scanner input;//The Scanner object to the read the file
	
	/**
	 * This constructor takes a String representing the file to be read and an int to set the maximum length of the strings to be added to the List
	 * @param fileName the file to be read
	 * @param stringLength the maximum length of the strings to be added to the List
	 */
	public FileProcessor(String fileName, int stringLength) 
	{
		setFileName(fileName);
		setStringLength(stringLength);		
	}//end constructor
	
	/**
	 * 
	 * @return the number of elements of in the ArrayList
	 */
	public int getArrayListSize() 
	{
		return stringList.size();
	}//end getArrayListSize
	
	/**
	 * Uses a Scanner object to read a file that has one String per line
	 * as it reads through the file, if it encounters a word longer than stringLength, it should throw a StringTooLongException
	 * Both StringTooLongException and FileNotFoundException are caught and handled within the method
	 */
	public void processFile() 
	{
		try
		{
			stringList = new ArrayList<>();
			input = new Scanner(new File(getFileName()));
			while(input.hasNext())
			{
				String add = input.next();
				if (add.length() > stringLength)
					throw new StringTooLongException();
				stringList.add(add);
			}	
		}
		catch(FileNotFoundException exception)
		{
			 System.out.println(exception.getMessage());
		}
		catch(StringTooLongException exception)
		{
			System.out.println(exception.getMessage());
		}
		finally
		{
			if (input != null)
				input.close();
		}	
	}//end processFile
	
	/**
	 * 
	 * @return fileName the name of the file
	 */
	public String getFileName() 
	{
		return fileName;
	}//end getFileName

	/**
	 * 
	 * @param fileName, the fileName to be set
	 */
	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}//end setFileName

	/**
	 * 
	 * @return the length of the string that was set
	 */
	public int getStringLength() 
	{
		return stringLength;
	}//end getStringLength

	/**
	 * 
	 * @param stringLength, the maximum length of the String to be set
	 */
	public void setStringLength(int stringLength) 
	{
		if (stringLength < 5)
			this.stringLength = 5;
		else 
			this.stringLength = stringLength;
	}//end setStringLength
	
	/**
	 * 
	 * @return the ArrayList with all the Strings that were added
	 */
	public ArrayList<String> getArrayList()
	{
		return stringList;
	}//end getArrayList
}//end class
