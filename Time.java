import java.util.Scanner;

public class Time{
  private int hours;
  private int minutes;

  public Time()
  {
    int hours = 0;
    int minutes = 0;
  }

  public Time(int hours, int minutes){
    this.hours = hours;
    this.minutes = minutes;

    if (hours > 23 || minutes > 59)
    {
      this.hours = 23;
      this.minutes = 59;
    }
  }

  public void displayTime()
  {
   if(minutes < 10){
    System.out.println(this.hours + ":0" + this.minutes);
   }
   else{
    System.out.println(this.hours + ":" + this.minutes);
   }
  }

  public void setHours(int hours)
  {
   this.hours = hours;
  }

  public void setMinutes(int minutes)
  {
    this.minutes = minutes;
  }

  public int GetHours()
  {
    return hours;
  }

  public int GetMinutes(){
    return minutes;
  }

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    //Time [] times = new Time[4];
   // for(int i = 0; i<4; i++)
    //{
      System.out.println("Enter the hours in military time: ");
      int militaryTime = sc.nextInt();
      System.out.println("Enter the minutes: ");
      int militaryMinutes = sc.nextInt();
      System.out.println("Enter the time you would like to add in minutes: ");
      int addedMinutes = sc.nextInt();

      Time time2 = new Time(militaryTime, militaryMinutes);

      if(time2.GetMinutes() + addedMinutes > 60)
      {
        time2.setHours(time2.GetHours() +1);
        time2.setMinutes((addedMinutes + time2.GetMinutes())- 60);
      }

      else if(time2.GetMinutes() + addedMinutes == 60)
      {
        time2.setHours(time2.GetHours() + 1);
        time2.setMinutes(0);
      }

      else{
        time2.setMinutes(time2.GetMinutes() + addedMinutes);
      }

     
  
  }
}
