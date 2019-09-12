package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentGradeController.
 */
public class StudentGradeController {
	
	/** The c. */
	Connection c;

	/**
	 * Instantiates a new student grade controller.
	 *
	 * @param MyConn the my conn
	 */
	public StudentGradeController(Connection MyConn) {
		this.c = MyConn;
	}
	
	/**
	 * Insert grade.
	 *
	 * @param SID the sid
	 * @param MID the mid
	 * @param Grade the grade
	 * @throws SQLException the SQL exception
	 */
	public void insertGrade(String SID, String MID, String Grade) throws SQLException{
		Statement Stmt = c.createStatement();
		String Create = "INSERT INTO school.module_grade(Grade,SID,MID) VALUES ('" + Grade + "', " + SID + ", " + MID + ");";
		Stmt.executeQuery(Create);
		

	}
	
	
	
	
}
