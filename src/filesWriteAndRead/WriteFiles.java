package filesWriteAndRead;

import java.io.*;

public class WriteFiles
{
  public static void main(String[] args) throws IOException
  {
    try {
      File obj = new File("sample1.txt");
      //FileWriter fiw = new FileWriter(obj); // here we just overwrite the file
      FileWriter fiw = new FileWriter(obj, true);//concat
      char c[] = {'l', 'o', 'v', 'e' };
     // fiw.write(c);
      String name = "Ani";
      fiw.write(name);
      fiw.write(c, 0, 4); // here we use offset from where to start, and how many letters to use
      fiw.close();
      System.out.println("Mission accomplished!");
    }
    catch (FileNotFoundException fnfe) {
      System.err.println(fnfe.getMessage());
    }
  }
}

