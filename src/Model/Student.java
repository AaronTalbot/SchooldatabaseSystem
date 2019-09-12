package Model;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */
public class Student extends Person {
	
	/** The dob. */
	private int DOB;
	
	/** The Modules. */
	private ArrayList<ModuleGrade> Modules = new ArrayList<>();
	
	/** The sid. */
	private int SID;



	/**
	 * Sets the DOB.
	 *
	 * @param dOB the d OB
	 * @param sID the s ID
	 */
	public void setDOB(int dOB, int sID) {
		DOB = dOB;
		SID = sID;
	}

	/**
	 * Instantiates a new student.
	 */
	public Student() {
		super();
	}

	/**
	 * Instantiates a new student.
	 *
	 * @param fname the fname
	 * @param lname the lname
	 * @param email the email
	 * @param phoneNum the phone num
	 * @param DOB the dob
	 */
	public Student(String fname, String lname, String email, int phoneNum, int DOB) {
		super(fname, lname,email, phoneNum);
		this.DOB = DOB;
	}

	/**
	 * Instantiates a new student.
	 *
	 * @param fname the fname
	 * @param mname the mname
	 * @param lname the lname
	 * @param email the email
	 * @param phoneNum the phone num
	 * @param DOB the dob
	 */
	public Student(String fname, String mname, String lname, String email, int phoneNum, int DOB) {
		super(fname, mname, lname,  email, phoneNum);
		this.DOB = DOB;
	}
	
	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public int getDOB() {
		return DOB;
	}
	
	/**
	 * Adds the module.
	 *
	 * @param m the m
	 */
	public void addModule(ModuleGrade m) {
		if(this.Modules.size() < 6) {
			this.Modules.add(m);
		}
		else {
			System.out.println("The student cannot have more then six modules.");
		}
	}
	
	/**
	 * Gets the module.
	 *
	 * @param index the index
	 * @return the module
	 */
	public ModuleGrade getModule(int index) {
		return this.Modules.get(index);
	}

	/**
	 * Gets the sid.
	 *
	 * @return the sid
	 */
	public int getSID() {
		return SID;
	}

	/**
	 * Sets the sid.
	 *
	 * @param sID the new sid
	 */
	public void setSID(int sID) {
		SID = sID;
	}

}
