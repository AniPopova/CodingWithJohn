package filesWriteAndRead;

import java.io.*;

public class ReadingAndWriting
{
  public static void main(String[] args)
  {
    try {
//      BufferedWriter bw = new BufferedWriter(
//          new FileWriter("C:\\Users\\user\\OneDrive\\Desktop\\testFiles\\output.txt"));
//      bw.write("Ani\n");
//      bw.write("Zlati\n");
//      bw.write("Vladi\n");
//      bw.write("Ismet");
//      bw.close();
      BufferedWriter bw = new BufferedWriter(
          new FileWriter("C:\\Users\\user\\OneDrive\\Desktop\\testFiles\\output-copy.txt"));
      BufferedReader br = new BufferedReader(
          new FileReader("C:\\Users\\user\\OneDrive\\Desktop\\testFiles\\output.txt"));
      String content;
      while((content = br.readLine()) != null) {
        System.out.println(content);
        bw.write(content+"\n");      }
      br.close();
    }
    catch (IOException ioe) {
      return;
    }
  }
}
