package Model;

// TODO: Auto-generated Javadoc
/**
 * The Class Name.
 */
public class Name {
	
	/** The Fname. */
	String Fname;
	
	/** The Mname. */
	String Mname;
	
	/** The Lname. */
	String Lname;
	
	
	/**
	 * Instantiates a new name.
	 *
	 * @param fname the fname
	 * @param mname the mname
	 * @param lname the lname
	 */
	public Name(String fname, String mname, String lname) {
		Fname = fname;
		Mname = mname;
		Lname = lname;
	}
	
	/**
	 * Instantiates a new name.
	 */
	public Name() {
		//Abstract Method
	}
	
	/**
	 * Instantiates a new name.
	 *
	 * @param fname the fname
	 * @param lname the lname
	 */
	public Name(String fname, String lname) {
		Fname = fname;
		Lname = lname;
	}
	
	/**
	 * Gets the fname.
	 *
	 * @return the fname
	 */
	public String getFname() {
		return Fname;
	}
	
	/**
	 * Sets the fname.
	 *
	 * @param fname the new fname
	 */
	public void setFname(String fname) {
		Fname = fname;
	}
	
	/**
	 * Gets the mname.
	 *
	 * @return the mname
	 */
	public String getMname() {
		return Mname;
	}
	
	/**
	 * Sets the mname.
	 *
	 * @param mname the new mname
	 */
	public void setMname(String mname) {
		Mname = mname;
	}
	
	/**
	 * Gets the lname.
	 *
	 * @return the lname
	 */
	public String getLname() {
		return Lname;
	}
	
	/**
	 * Sets the lname.
	 *
	 * @param lname the new lname
	 */
	public void setLname(String lname) {
		Lname = lname;
	}
	
	

}
