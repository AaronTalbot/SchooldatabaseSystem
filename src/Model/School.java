package Model;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class School.
 */
public class School {
	
	/** The Classes. */
	private ArrayList<ClassGroup> Classes;
	
	/** The id. */
	private int ID;
	
	/**
	 * Instantiates a new school.
	 *
	 * @param ID the id
	 */
	public School(int ID) {
		this.Classes = new ArrayList<ClassGroup>();
		this.setID(ID);
	}

	/**
	 * Gets the classes.
	 *
	 * @return the classes
	 */
	public ArrayList<ClassGroup> getClasses() {
		return Classes;
	}
	
	/**
	 * Adds the class.
	 *
	 * @param C the c
	 */
	public void AddClass(ClassGroup C) {
		this.Classes.add(C);
	}
	
	/**
	 * Removes the class.
	 *
	 * @param C the c
	 */
	public void removeClass(ClassGroup C) {
		if(this.Classes.contains(C)) {
			this.Classes.remove(C);
		}
		else {
			System.out.println("There is no class to remove.");
		}
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
