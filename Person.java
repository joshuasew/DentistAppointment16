public class Person{
	private String lastName;
	private String firstName;
	private String zipCode;

	//default constructor
	private void Person(){
		lastName = "X";
		firstName = "X";
		zipCode = "X";
	}

	//overloading constructor
	private void Person(String last, String first, String zip){
		this.lastName = last;
		this.firstName =first;
		this.zipCode = zip;
	}

	private void displayPerson(){
		System.out.println("Last Name: " + lastName);
		System.out.println("First Name: " + firstName);
		System.out.println("Zip Code: " + zipCode);
	}
}
