package Controller;

import java.sql.*;

import Model.Student;

// TODO: Auto-generated Javadoc
/**
 * The Class ClassController.
 */
public class ClassController {
	
	/** The c. */
	private Connection c;
	
	/**
	 * Instantiates a new class controller.
	 *
	 * @param MyConn the my conn
	 */
	public ClassController(Connection MyConn) {
		this.c = MyConn;
	}
	
	/**
	 * Creates the class.
	 *
	 * @param name the name
	 * @throws SQLException the SQL exception
	 */
	public void CreateClass(String name) throws SQLException {
		Statement stmt = c.createStatement();
		String Create = "INSERT INTO class(Name) VALUES (" + "'" + name + "');";
		stmt.executeUpdate(Create);
		
	}
	
	/**
	 * Gets the classes.
	 *
	 * @return the string
	 * @throws SQLException the SQL exception
	 */
	public String GetClasses() throws SQLException {
		String SQL = "Select * FROM class";
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(SQL);
		String out = " ";
		while(rs.next()) {
			String name = rs.getString("Name");
			int ID  = rs.getInt("CID");
			out += name + " " +  ID + "\n";
		}
		System.out.println(out);
		return out;
		
	}
	


}
