/*
 * Joshua Sew-Hee and Hanleigh Heinzmann
 * Date Modified: Oct 26, 2016
 * ODD - Date
 */

 public class Date{
   private int month;
   private int day;
   private int year;

   public Date()
   {
     month = 1;
     day = 1;
     year = 2000;
   }

   public Date(int month1, int day1, int year1){
     month = month1;
     day = day1;
     year = year1;
   }

   public void displayDate()
   {
     //System.out.printf("%d/%d/%d", month, day, year);
     System.out.print(month + "/" + day + "/" + year);
   }

   public static void main(String args[]){
   /*Date myDate = new Date();
     if (args.length == 0){
       myDate.getDate();
       myDate.displayDate();
     }
     if (args.length == 3){
     myDate.getDate(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
     myDate.displayDate();*/
   }
 }
