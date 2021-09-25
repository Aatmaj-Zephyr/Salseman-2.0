import java.util.*;
public class Main
{

  public static void main (String[] args)
  {

    Getinput in = new Getinput (); 
    //Make a new Getinput object. This will be used to run the set() method.
    //We can use it for running the program on different different cities and different different paths.
 
    
    citylist input = in.set ("Cities.txt", "Neighbours.txt");
    //This will make instances of the city objects with positions(coordinates) as given in the "coordinates.txt" file,
    //and set the available paths from the "paths.txt" file. Then this cities instances are returned in a citylist.
    
    System.out.println ("Here is the list of cities."); 
    input.print (",");
    //Print the values in the citylist for the user to choose from.
    
    System.out.println ();//blank line
    
    pathfinder mypathfinder; 
    //Make instance (almost) of pathfinder object. This class is one which finds the shortest path.
    
    Scanner myObj = new Scanner (System.in);	// Create a Scanner object to get the input of starting and ending cities.

    while (true)
    //Repeat until the user enters a valid city to start and to reach.
      {
         String start = ; //accept the name of the city and put it in a string named start
	
	 String end = ;//accept the name of the city and put it in a string named end
	
	  try //try-catch to check if the entered city is in the list "input" or not.
	{

	  mypathfinder = new pathfinder (start, end, input);
	  /*Find the shortest path from the city "start" to the city "end" by creating the instance of pathfinder 
	  and calling the parametarized constructor.
	  For that, we need to pass the citylist 'input' to it. 
	  It first checks if the two city names we passed, i.e. start and end are in the list or not. 
	  If exist, then pathfinder finds the shortest path which we will extract later.
	  If he do not exist in the citylist, then the constructor throws ArrayIndexOutOfBoundsException, which is catched.
	  */
	  break;
	}
	catch (ArrayIndexOutOfBoundsException a)
	//city name is invalid, or does not exist in the input citylist.
	{
	  System.out.println ("Error!"); //name mismatch.
	}
      }
    
    System.out.print ("The path is ");
    mypathfinder.printpathname ();
    //directly print the shortest path. We can extract it using methods, buthere in this case direct printing is easier.
    
    System.out.println ();//blank line
    System.out.print ("The total distance is ");
    mypathfinder.printdistance ();
    //directly print the shortest distance. We can extract it using methods, buthere in this case direct printing is easier.
    System.out.print ("km");
  }



}
