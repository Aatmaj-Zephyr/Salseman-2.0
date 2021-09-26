import java.util.*;
public class citylist
//This is the class which is made for storing city objects as a list.
{
  ArrayList < city > listofcities; 
  //This arraylist is the one which has all the city objects.
  
  citylist ()//default constructor.
  {
    listofcities = new ArrayList < city > (); //instantiate new ArrayList
  }
  
  public void append (city a)//Method to append in the list.
  {
    listofcities.add (a);
  }
  /*
  contains() Method is used to check if the citylist contains the list or not.
   If citylist has the city, then return true, else return false.
   We can give parameters of city, city name or coordinates.
  */
  public boolean contains (city a)
  
  { 
   
    for (int j = 0; j < listofcities.size (); j++)
      {
	if (city.equals (listofcities.get (j), a) == true)
	  {
	    return true; 
	  }
      }
    return false;
  }
 
  public boolean contains (String a)
  {
    for (int j = 0; j < listofcities.size (); j++)
      {
	if (city.equals (listofcities.get (j), a) == true)
	  {
	    return true;
	  }
      }
    return false;
  }
  
  public boolean contains(double a, double b){
      return contains(new city(a,b));
  }
  
  
  public void set (citylist a) 
  //method to set values of another citylist into this citylist.
  {
    listofcities.clear ();
    for (int i = 0; i < a.listofcities.size (); i++)
      {
	listofcities.add (a.listofcities.get (i));
      }
  }

  public city last () //return the last element in the list
  {
    return listofcities.get (listofcities.size () - 1);
  }

  public void pop () //pop from the list
  {
    listofcities.remove (listofcities.size () - 1);
  }
  
  public double sum ()
  //This method is present to calculate the path length.
  //This method sums up the distances between all the two cities in the list.
  {
    double temp = 0;//temparory variable to store the sum.
    for (int i = 0; i <= (listofcities.size () - 2); i++)
      {
	temp =
	  temp + complex.dist (listofcities.get (i).coordinates,
			       listofcities.get (i + 1).coordinates);
      }
    return temp;
  }
  /*
  Methods to print the elements  (name of the cities) of the citylist.
  print()- print the names.
  println()- print the names on a new line .
  print(String Seperator)- print with Seperator, like comma, etc.
  */
  public void print ()
  {
    for (int i = 0; i <= (listofcities.size () - 1); i++)
      {
	System.out.print (listofcities.get (i).name);
      }
  }
  public void println ()
  {
    for (int i = 0; i <= (listofcities.size () - 1); i++)
      {
	System.out.println (listofcities.get (i).name);
      }
  }
  public void print (String Seperator)
  {
    for (int i = 0; i < (listofcities.size () - 1); i++)
      {
	System.out.print (listofcities.get (i).name);
	System.out.print (Seperator);//print with Seperator
      }
    System.out.print (listofcities.get (listofcities.size () - 1).name);
  }
  public String send(){
      String sendstring= new String();
       for (int i = 0; i < (listofcities.size () - 1); i++)
      {
	sendstring= sendstring + listofcities.get (i).name;

      }
    sendstring= sendstring + (listofcities.get (listofcities.size () - 1).name);
    return sendstring;
  }
  /*
  posn-The method to find the position of the city in the list.
  Can add parameters of city object, city name or coordinates.
  */
  public int posn (city a)
  {
    for (int j = 0; j < listofcities.size (); j++)
      {
	if (city.equals (listofcities.get (j), a) == true)
	  {
	    return j;
	  }
      }
    return -1;
  }
  public int posn (String a)
  {
    for (int j = 0; j < listofcities.size (); j++)
      {
	if (city.equals (listofcities.get (j), a) == true)
	  {
	    return j;
	  }
      }
    return -1;
  }
  public int posn(double a,double b){
      return posn(new city(a,b));
  }
  
  /*
  Method to get the city object from the citylist.
  */
    public city get (int a) //get the a'th position of the citylist
  {
    return listofcities.get (a);
  }
    public city get (city a)
  {
    return get (posn (a));
  }
    public city get (String a)
  {
    return listofcities.get (posn (a));
  }
    public city get (double a, double b)
  {
    return get (new city (a, b));
  }
  

  
  public int size ()//the size of the citylist
  {
    return listofcities.size ();
  }
}
