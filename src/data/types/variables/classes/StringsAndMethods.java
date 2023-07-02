package data.types.variables.classes;

public class StringsAndMethods
{
    public static void main(String[] args)
    {
      /*String firstName = "John \\ \"AwesomeGuy\" Peterson";
      String firstName = "John \n\"AwesomeGuy\"\n Peterson";*/

      String firstName = "John";
      String lastName = "Peterson";
      //System.out.println(firstName);
      String fullName = firstName + " " + lastName;
      //System.out.println(firstName+" "+lastName);
      System.out.println(fullName);

      int fullNameLength = fullName.length();
      System.out.println(fullName.length());
      System.out.println(fullNameLength);
      System.out.println(fullName.charAt(0));//gives the first letter of a string (or some other)
      System.out.println(fullName.toUpperCase());//just shows it in upper case
      System.out.println(fullName.toLowerCase());//just shows it in lower case
      System.out.println(fullName.trim());//just removes blank spaces from both sides

      String newString = firstName.concat((" ").concat(lastName));// makes a whole new string
      System.out.println(newString);
      System.out.println(newString = newString.substring(5, newString.length() - 1));

    }
}
