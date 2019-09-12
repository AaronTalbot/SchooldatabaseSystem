package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Student;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentController.
 */
public class StudentController {
	
	/** The c. */
	private Connection c;
	
	/**
	 * Instantiates a new student controller.
	 *
	 * @param MyConn the my conn
	 */
	public StudentController(Connection MyConn) {
		this.c = MyConn;
	}
	
	/**
	 * Instert student.
	 *
	 * @param fname the fname
	 * @param Mname the mname
	 * @param Lname the lname
	 * @param Mail the mail
	 * @param num the num
	 * @param age the age
	 * @param CID the cid
	 * @throws SQLException the SQL exception
	 */
	public void InstertStudent(String fname,String Mname, String Lname, String Mail,String num, String age, int CID) throws SQLException {
		Statement stmt = c.createStatement();
		Mname = Mname.replaceAll("\\s","");
		String Create = "INSERT INTO student(First_Name, Middle_Name, Last_Name, Email, Phone_Number, Age, CID) VALUES (";
		if(Mname == "") {
			Create += "'" + fname + "'" + "," + "null" + "," + "'" + Lname + "'" + "," + "'" + Mail
			+ "'" + "," + num + "," + age + "," +  CID + ");";
		}
		else {
			Create += "'" + fname + "'" + "," + "'" + Mname + "'" +  "," + "'" + Lname + "'" + "," + "'" + Mail
					+ "'" + "," + num + "," + age + ", "  + CID +  ");";
		}
		stmt.executeUpdate(Create);
		
		
	}
	
	/**
	 * List students.
	 *
	 * @return the string
	 * @throws SQLException the SQL exception
	 */
	public String ListStudents() throws SQLException {
		String SQL = "Select * FROM school.student";
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(SQL);
		String out = " ";
		while(rs.next()) {
			int id = rs.getInt("SID");
			String fn = rs.getString("First_Name");
			String Mn = rs.getString("Middle_Name");
			String Ln = rs.getString("Last_Name");
			String Em = rs.getString("Email");
			int Pn = rs.getInt("Phone_Number");
			int age = rs.getInt("Age");
			int CID = rs.getInt("CID");
			out += id + " " +  fn + " " + Mn + " " + Ln + " " + Em + " " + Pn + " " + age + " " + CID + "\n";
		}
		System.out.println(out);
		return out;
	}
	
	/**
	 * Removes the student.
	 *
	 * @param Id the id
	 * @throws SQLException the SQL exception
	 */
	public void RemoveStudent(String Id) throws SQLException {
		Integer.parseInt(Id);
		String SQL = "DELETE From Student Where SID= " + "'" + Id + "';";
		Statement st = c.createStatement();
		st.executeUpdate(SQL);
	}

}
