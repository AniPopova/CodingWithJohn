package enumeration;

import java.time.Year;
import java.util.Calendar;
import java.util.Random;

public class StuffEnums
{
  public static void main(String[] args)
  {


    CalendarType[] months = CalendarType.values();

//    for (CalendarType month : months) {
//      //System.out.println(month.ordinal()+1 + ". " + month);
//      System.out.println(month.ordinal() + 1 + ". " + month + "( Number of days: " +
//          month.getNumberOfDays() + ", Year: " + month.getYear() + ")");
//      month.infoForTheMonths();
//    }
//    int year = Year.now().getValue();
//    System.out.println(year);
    int month = new Random().nextInt(12);
    int year = new Random().nextInt(25)+2000;
    months[month].setYear(year);
    System.out.println("The year is "+year+", month is "+months[month].getName()+
        ", it has a "+months[month].getNumberOfDays()+" days");
    //months[month].getNumberOfDays();

    for (int i = 0; i < months[month].getNumberOfDays(); i++) {

    }
  }
}
