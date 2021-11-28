
/**
 * This class represents an exception that is thrown when a String that is too long is encountered 
 * 
 * @author carla
 * @version 1.0
 * Programming Lab 4
 * Fall 2021
 */
public class StringTooLongException extends Exception
{
	/**
	 * 
	 * This constructor passes a "String is too long" to the parent constructor representing the String that is printed on the console when getMessage() is invoked.
	 */
	public StringTooLongException()
	{
		super("String is too long!");
	}//end empty-argument constructor
}//end class
