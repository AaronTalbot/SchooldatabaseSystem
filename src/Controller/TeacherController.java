package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class TeacherController.
 */
public class TeacherController {
	
	/** The c. */
	private Connection c;
	
	/**
	 * Instantiates a new teacher controller.
	 *
	 * @param MyConn the my conn
	 */
	public TeacherController(Connection MyConn) {
		this.c = MyConn;
	}
	
	/**
	 * Adds the teacher.
	 *
	 * @param fname the fname
	 * @param Mname the mname
	 * @param Lname the lname
	 * @param Mail the mail
	 * @param num the num
	 * @param Degree the degree
	 * @throws SQLException the SQL exception
	 */
	public void AddTeacher(String fname,String Mname, String Lname, String Mail,String num, String Degree) throws SQLException {
		Statement stmt = c.createStatement();
		Mname = Mname.replaceAll("\\s","");
		String Create = "INSERT INTO teacher(First_Name, Last_Name, Email, Phone_Number, Degree, MiddleName) VALUES (";
		Create += "'" + fname  + "','" + Lname + "','" + Mail + "'," + num + ",'" + Degree + "','" + Mname + "');";
		stmt.executeUpdate(Create);
		
	}
	
	/**
	 * Edits the teacher.
	 *
	 * @param ID the id
	 * @param Degree the degree
	 * @throws SQLException the SQL exception
	 */
	public void EditTeacher(String ID, String Degree) throws SQLException {
		Statement stmt = c.createStatement();
		String Create = "UPDATE teacher SET Degree = '" + Degree + "' WHERE TID = " + ID + ";";
		stmt.executeUpdate(Create);
	}
	
	/**
	 * List teachers.
	 *
	 * @return the string
	 * @throws SQLException the SQL exception
	 */
	public String ListTeachers() throws SQLException {
		String SQL = "Select * FROM school.teacher";
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(SQL);
		String out = " ";
		while(rs.next()) {
			int id = rs.getInt("TID");
			String fn = rs.getString("First_Name");
			String Mn = rs.getString("MiddleName");
			String Ln = rs.getString("Last_Name");
			String Em = rs.getString("Email");
			int Pn = rs.getInt("Phone_Number");
			String age = rs.getString("degree");
			out += id + " " +  fn + " " + Mn + " " + Ln + " " + Em + " " + Pn + " " + age  + "\n";
		}
		System.out.println(out);
		return out;
		
	}
	

}
