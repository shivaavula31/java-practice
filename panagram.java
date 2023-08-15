// Java Program to check whether a string is Panagram or not
import java.util.*;
class panagram{

// Returns true if the string is pangram else false
    public static boolean checkPangram (String str){

    // Create a hash table to mark the characters present in the string
    // By default all the elements of mark would be false.
    boolean[]mark = new boolean[26];
    int index = 0;

    // Traverse all characters
    for (int i = 0; i < str.length (); i++)
      {
    // If uppercase character, subtract 'A'to find index.
	if ('A' <= str.charAt (i) && str.charAt (i) <= 'Z')

	  index = str.charAt (i) - 'A';

    // If lowercase character, subtract 'a'to find index.
	else if ('a' <= str.charAt (i) && str.charAt (i) <= 'z')

	  index = str.charAt (i) - 'a';

    // Mark current character
	mark[index] = true;
      }

    // Return false if any character is unmarked
    for (int i = 0; i <= 25; i++)
      if (mark[i] == false)
	return (false);

    // If all characters were present
    return (true);
  }

    // Main Code
  public static void main (String[]args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println ("Enter a string");
      String str=sc.next();
    if (checkPangram (str) == true)
      System.out.print (str + " is a pangram.");
    else
      System.out.print (str + " is not a pangram.");

  }
}