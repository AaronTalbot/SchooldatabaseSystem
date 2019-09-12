package Model;

// TODO: Auto-generated Javadoc
/**
 * The Class ModuleGrade.
 */
public class ModuleGrade {
	
	/** The Grade. */
	private int Grade;
	
	/** The Module. */
	private String Module;
	
	/** The id. */
	private int ID;
	
	
	/**
	 * Instantiates a new module grade.
	 *
	 * @param grade the grade
	 * @param module the module
	 */
	public ModuleGrade(int grade, String module) {
		super();
		setGrade(grade);
		setModule(module);
	}


	/**
	 * Gets the module.
	 *
	 * @return the module
	 */
	public String getModule() {
		return Module;
	}


	/**
	 * Sets the module.
	 *
	 * @param module the new module
	 */
	public void setModule(String module) {
		Module = module;
	}


	/**
	 * Gets the grade.
	 *
	 * @return the grade
	 */
	public int getGrade() {
		return Grade;
	}


	/**
	 * Sets the grade.
	 *
	 * @param grade the new grade
	 */
	public void setGrade(int grade) {
		Grade = grade;
	}


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getID() {
		return ID;
	}


	/**
	 * Sets the id.
	 *
	 * @param iD the new id
	 */
	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	

}
