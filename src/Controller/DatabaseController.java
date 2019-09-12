package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseController.
 */
public class DatabaseController {
	
	/** The sc. */
	private StudentController SC;
	
	/** The cc. */
	private ClassController CC;
	
	/** The tc. */
	private TeacherController TC;
	
	/** The mc. */
	private ModuleController MC;
	
	/** The sg. */
	private StudentGradeController SG;
	
	/** The My conn. */
	private Connection MyConn; 

	
	
	
	/**
	 * Instantiates a new database controller.
	 *
	 * @throws SQLException the SQL exception
	 */
	public DatabaseController() throws SQLException {
		MyConn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","97560");
		setSC(new StudentController(MyConn));
		setCC(new ClassController(MyConn));
		setTC(new TeacherController(MyConn));
		setMC(new ModuleController(MyConn));
	}




	/**
	 * Gets the sc.
	 *
	 * @return the sC
	 */
	public StudentController getSC() {
		return SC;
	}




	/**
	 * Sets the sc.
	 *
	 * @param sC the sC to set
	 */
	public void setSC(StudentController sC) {
		SC = sC;
	}




	/**
	 * Gets the cc.
	 *
	 * @return the cC
	 */
	public ClassController getCC() {
		return CC;
	}




	/**
	 * Sets the cc.
	 *
	 * @param cC the cC to set
	 */
	public void setCC(ClassController cC) {
		CC = cC;
	}




	/**
	 * Gets the tc.
	 *
	 * @return the tC
	 */
	public TeacherController getTC() {
		return TC;
	}




	/**
	 * Sets the tc.
	 *
	 * @param tC the tC to set
	 */
	public void setTC(TeacherController tC) {
		TC = tC;
	}




	/**
	 * Gets the mc.
	 *
	 * @return the mC
	 */
	public ModuleController getMC() {
		return MC;
	}




	/**
	 * Sets the mc.
	 *
	 * @param mC the mC to set
	 */
	public void setMC(ModuleController mC) {
		MC = mC;
	}




	/**
	 * Gets the sg.
	 *
	 * @return the sg
	 */
	public StudentGradeController getSG() {
		return SG;
	}




	/**
	 * Sets the sg.
	 *
	 * @param sG the new sg
	 */
	public void setSG(StudentGradeController sG) {
		SG = sG;
	}

}
