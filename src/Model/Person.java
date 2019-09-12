package Model;

// TODO: Auto-generated Javadoc
/**
 * The Class Person.
 */
public class Person {
	
	/** The name. */
	private Name name;
	
	/** The email. */
	private String email;
	
	/** The Phone num. */
	private int PhoneNum;
	
	/**
	 * Instantiates a new person.
	 */
	public Person() {
		super();
	}
	
	
	/**
	 * Instantiates a new person.
	 *
	 * @param fname the fname
	 * @param mname the mname
	 * @param lname the lname
	 * @param email the email
	 * @param phoneNum the phone num
	 */
	public Person(String fname, String mname, String lname, String email, int phoneNum) {
		name = new Name(fname, mname, lname);
		this.email = email;
		PhoneNum = phoneNum;
	}
	
	/**
	 * Instantiates a new person.
	 *
	 * @param fname the fname
	 * @param lname the lname
	 * @param email the email
	 * @param phoneNum the phone num
	 */
	public Person(String fname, String lname, String email, int phoneNum) {
		name = new Name(fname,lname);
		this.email = email;
		PhoneNum = phoneNum;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public Name getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Gets the phone num.
	 *
	 * @return the phone num
	 */
	public int getPhoneNum() {
		return PhoneNum;
	}
	
	/**
	 * Sets the phone num.
	 *
	 * @param phoneNum the new phone num
	 */
	public void setPhoneNum(int phoneNum) {
		PhoneNum = phoneNum;
	}

	

}
