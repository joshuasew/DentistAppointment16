import java.util.Scanner;

public class DentalAppointment{
	private Person patient;
	private Date date;
	private Time startTime;
	private Time endTime;
	private int duration;

	//default constructor
	public DentalAppointment(String lastName, String firstName, String zip, int month, int day, int year, int hour, int minute)
	{
		duration = 30;
		patient = new Person(lastName, firstName, zip);
		date = new Date(month, day, year);
		startTime = new Time(hour, minute);
		endTime = new Time(hour, minute);

		if(endTime.GetMinutes() + duration > 60)
      {
       	endTime.setHours(endTime.GetHours() +1);
        endTime.setMinutes((duration + endTime.GetMinutes())- 60);
      }

      else{
        endTime.setMinutes(endTime.GetMinutes() + duration);
      }
	}

	public DentalAppointment(String lastName, String firstName, String zip, int month, int day, int year, int hour, int minute, int duration)
	{
		Scanner sc = new Scanner(System.in);

		while(duration > 240)
		{
			System.out.println("Invalid appointment duration. Enter a time less than 240 minutes: ");
			duration = sc.nextInt();
		}

		duration = duration;
		patient = new Person(lastName, firstName, zip);
		date = new Date(month, day, year);
		startTime = new Time(hour, minute);
		endTime = new Time(hour, minute);

		if(endTime.GetMinutes() + duration > 60)
      {
       	endTime.setHours(endTime.GetHours() +1);
        endTime.setMinutes((duration + endTime.GetMinutes())- 60);
      }

      else{
        endTime.setMinutes(endTime.GetMinutes() + duration);
      }

	}

	public void display(){
		patient.displayPerson();
		date.displayDate();
		System.out.println("");
		System.out.print("The start time is ");
		startTime.displayTime();
		System.out.print("The end time is ");
		endTime.displayTime();
	}

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		String first = "";
		String last = "";
		String zipCode = "";
		int month1 = 0;
		int day1 = 0;
		int year1 = 0;
		int start = 0;
		int end = 0;
		int dur = 0;

		for (int i = 0; i < 3; i ++){
			System.out.print("Enter first name: ");
			first = sc.nextLine();
			System.out.print("Enter last name: ");
			last = sc.nextLine();
			System.out.print("Enter zip code: ");
			zipCode = sc.nextLine();
			System.out.print("Enter the month: ");
			month1 = sc.nextInt();
			System.out.print("Enter the day: ");
			day1 = sc.nextInt();
			System.out.print("Enter the year: ");
			year1 = sc.nextInt();
			System.out.print("Enter the hour in military time: ");
			start = sc.nextInt();
			System.out.print("Enter the minutes: ");
			end = sc.nextInt();
			System.out.print("Enter added time: ");
			dur = sc.nextInt();

			sc.nextLine();

			DentalAppointment test = new DentalAppointment(first, last, zipCode, month1, day1, year1, start, end, dur);

			test.display();

		}
	}
}
