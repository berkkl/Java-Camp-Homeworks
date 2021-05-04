public class UserManager {
	
	int id;
	String firstName;
	String lastName;
	String mail;
	String courses[];
	

	public void add(int id, String firstName, String lastName, String mail, String courses[]) {
		System.out.println(firstName + " " + lastName + " is now added to the system!");
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.mail=mail;
	}
}
