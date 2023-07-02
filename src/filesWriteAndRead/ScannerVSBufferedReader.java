package filesWriteAndRead;

import java.io.*;


public class ScannerVSBufferedReader
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //it is much more faster than the scanner because it uses stream
    System.out.println("Please enter your name: ");
    String name = br.readLine();
    System.out.println("Your name is: "+name);

  }
}
