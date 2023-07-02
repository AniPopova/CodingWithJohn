package filesWriteAndRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles
{
  public static void main(String[] args) throws IOException
  {
    try {
      File obj = new File("sample.txt");
      FileReader readSample = new FileReader(obj);
      char c[] = new char[10];
      //readSample.read(c, 1, 2);
      //readSample.read(c);
      for (char k:c) {
        System.out.println(k);
      }
      readSample.close();
    }
    catch (FileNotFoundException fnfe) {
      System.err.println(fnfe.getMessage());
    }
  }
}

