package filesWriteAndRead;

import java.io.*;

public class JohnWriting
{
  public static void main(String[] args) //throws IOException - we put code in try-catch instead
  {
    String[] names = {"John", "Carl", "Jerry"};
    try {
      //BufferedWriter writer = new BufferedWriter(new FileWriter("Ani.txt")); // here we have to specify where do we want to write
      BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\IdeaProjects\\codingWithJohn\\Ani.txt")); // here we have to specify where do we want to write
      writer.write("Hi Ani, we learn new things here! ");
      //writer.write("Here is another line! ");
      writer.write("\nHere is another line! ");
      for (String name : names) {
        writer.write("\n" + name);
      }
      writer.close();

    }
    catch (IOException ioe) {
      ioe.getMessage();
    }
    try {
      BufferedReader reader = new BufferedReader(new FileReader("Ani.txt"));
      String line;
      while((line = reader.readLine()) != null){
        System.out.println(line);
      }
     // System.out.println(reader.readLine());
      reader.close();
    }
    catch (IOException ioe) {
      ioe.getMessage();
    }
  }
}