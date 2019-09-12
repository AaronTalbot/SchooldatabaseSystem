package Model;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class ClassGroup.
 */
public class ClassGroup {
	
	/** The group. */
	ArrayList<Student> group;
	
	/** The name. */
	private String name;

	/**
	 * Instantiates a new class group.
	 *
	 * @param Name the name
	 */
	public ClassGroup( String Name) {
		group = new ArrayList<Student>();
		this.setName(Name);
	}
	
	/**
	 * Adds the student.
	 *
	 * @param s the s
	 */
	public void addStudent(Student s) {
		group.add(s);
	}
	
	
	/**
	 * Removes the student.
	 *
	 * @param index the index
	 */
	public void removeStudent(int index) {
		if(index > group.size()) {
			System.out.println("Cannot remove, out of index");
		}
		else {
			group.remove(index);
		}
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}


	
	
	

}
