import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class txtWriter {
  //This class is used to write on the files.
  public void writeneighbours(String neighbours)
  throws IOException {
    BufferedWriter output;
    output = new BufferedWriter(new FileWriter("Neighbours.txt", true)); //clears file every time
    File file = new File("Neighbours.txt");
    if (file.length() == 0)
      output.append(neighbours);
    else {
      output.append("\r\n");
      output.append(neighbours);
    }
    output.close();
  }
  public void Writecity(String citydata)
  throws IOException {
    BufferedWriter output;
    output = new BufferedWriter(new FileWriter("cities.txt", true)); //clears file every time
    File file = new File("cities.txt");
    if (file.length() == 0)
      output.append(citydata);
    else {
      output.append("\r\n");
      output.append(citydata);
    }
    output.close();
  }
  //How to acess it 
  /*
txtWriter w= new txtWriter();
  try{w.writeneighbours("B:C,A");}
  catch(Exception ex){}
  */
  //NOTE-writeneighbours tested. Working.
  //Writecity not tested
}
