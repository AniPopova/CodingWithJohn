package enumeration;

import java.time.Year;

public enum CalendarType
{
  JANUARY( "January",31, 2022),
  FEBRUARY("February",28, 2022) {
    @Override
    public void infoForTheMonths()
    {
      System.out.println("Number of the days for " + name() + " is " + getNumberOfDays() +
          " and they are not fixed, it depends if it is leap year.");
    }
  },
  MARCH("March",31, 2022),
  APRIL("April",30, 2022),
  MAY("May",31, 2022),
  JUNE("June",30, 2022),
  JULY("July",31, 2022),
  AUGUST("August",31, 2022),
  SEPTEMBER("September",30, 2022),
  OCTOBER("October",31, 2022),
  NOVEMBER("November",30, 2022),
  DECEMBER("December",31, 2022);

  private int numberOfDays;
  private int year;

  private String name;

  CalendarType( String name,int numberOfDays, int year)
  {
    this.name = name;
    setYear(year);
    setNumberOfDays(numberOfDays);

  }

  public int getNumberOfDays()
  {
    return numberOfDays;
  }

  public void setNumberOfDays(int numberOfDays)
  {
    this.numberOfDays = numberOfDays;
    if (numberOfDays == 28) {
      if (year % 4 == 0) {
        this.numberOfDays = 29;
      }
    }
  }

  public int getYear()
  {
    return year;
  }

  public void setYear(int year)
  {
    this.year = year;
    setNumberOfDays(numberOfDays);
  }

  public String getName()
  {
    return name;
  }

  @Override
  public String toString()
  {
    return super.toString().toLowerCase();
  }

  public void infoForTheMonths()
  {
    System.out.println("Number of the days for " + name() + " is " + numberOfDays + " and they are fixed.");
  }
}

