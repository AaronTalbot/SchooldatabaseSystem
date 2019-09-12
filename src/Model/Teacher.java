package Model;

// TODO: Auto-generated Javadoc
/**
 * The Class Teacher.
 */
public class Teacher extends Person {
	
	/** The Degree. */
	private String Degree;

	/**
	 * Instantiates a new teacher.
	 */
	public Teacher() {
		super();
	}

	/**
	 * Instantiates a new teacher.
	 *
	 * @param fname the fname
	 * @param lname the lname
	 * @param email the email
	 * @param phoneNum the phone num
	 * @param Degree the degree
	 */
	public Teacher(String fname, String lname, String email, int phoneNum, String Degree) {
		super(fname, lname, email, phoneNum);
		this.Degree = Degree;
	}

	/**
	 * Instantiates a new teacher.
	 *
	 * @param fname the fname
	 * @param mname the mname
	 * @param lname the lname
	 * @param email the email
	 * @param phoneNum the phone num
	 * @param Degree the degree
	 */
	public Teacher(String fname, String mname, String lname, String email, int phoneNum, String Degree) {
		super(fname, mname, lname,  email, phoneNum);
		this.Degree = Degree;

	}

	/**
	 * Gets the degree.
	 *
	 * @return the degree
	 */
	public String getDegree() {
		return Degree;
	}

	/**
	 * Sets the degree.
	 *
	 * @param degree the new degree
	 */
	public void setDegree(String degree) {
		Degree = degree;
	}
	
	

}
