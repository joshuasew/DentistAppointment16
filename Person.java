public class Person{
	private String lastName;
	private String firstName;
	private String zipCode;

	//default constructor
	private void getPerson(){
		lastName = "X";
		firstName = "X";
		zipCode = "X";
	}

	//overloading constructor
	private void getPerson(String last, String first, String zip){
		this.lastName = last;
		this.firstName =first;
		this.zipCode = zip;
	}

	private void displayPerson(){
		System.out.println("Last Name: " + lastName);
		System.out.println("First Name: " + firstName);
		System.out.println("Zip Code: " + zipCode);
	}

	 public static void main(String args[]){
     Person newPerson = new Person();
     if (args.length == 0){
       newPerson.getPerson();
       newPerson.displayPerson();
     }
     if (args.length == 3){
     newPerson.getPerson(args[0], args[1], args[2]);
     newPerson.displayPerson();
   }
 }
}
