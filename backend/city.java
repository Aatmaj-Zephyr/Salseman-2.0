import java.util.*;
public class city
{
  complex coordinates;
  //The position of the city stored as complex coordinates.

  String name;
  //name of the city.

  citylist neighbours;
  //the neighbours of the city stored in a citylist.
  //Note that the neighbors are those from whome path to the city can lead. This is useful for  one-way aths as well.

  city (double x, double y)
    //the parametrized constructor to set the position of the city.
  {
    coordinates = new complex (x, y);	//set coordinates

    neighbours = new citylist ();	//instantiate neighbours
    name = new String ();	//instantiate name.
  }

  city (double x, double y, String myname)
  {
    //another parametrized constructor.
    //In case someone wans to add name at the time of making instances.
    this (x, y);
    setname (myname);
  }
  
  public void setname (String myname)
  // To set the name of the city.
  {
    name = myname;
  }
  
  /*The equals methods
  The equals methods check if two cities are equal or not. 
  Two cities cannot be equated directly as they are instances of objects.
  Two cities are equal if-
  - names equal
  - coordinates equal 
  - both
  */
  public static boolean equals (city a, city b)
  {
      //Two cities are the same if their coordinates are equal
    if (complex.equals (a.coordinates, b.coordinates) == true)
      {
	return true;
      }
    else
      {
	return false;
      }
  }
  public static boolean equals (city a, String b)
  {  //Two cities are same if their names are equal
    if (b.equals (a.name))
      {
	return true;
      }
    else
      {
	return false;
      }
  }
  public static boolean equals (String b, city a)
  {  //Two cities are same if their names are equal
    if (b.equals (a.name))
      {
	return true;
      }
    else
      {
	return false;
      }
  }
  
  
}
