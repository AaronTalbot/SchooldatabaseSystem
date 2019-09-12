package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class ModuleController.
 */
public class ModuleController {
	
	/** The c. */
	private Connection c;
	
	/**
	 * Instantiates a new module controller.
	 *
	 * @param MyConn the my conn
	 */
	public ModuleController(Connection MyConn) {
		this.c = MyConn;
	}
	
	/**
	 * Adds the module.
	 *
	 * @param Name the name
	 * @throws SQLException the SQL exception
	 */
	public void AddModule(String Name) throws SQLException {
		Statement stmt = c.createStatement();
		String Create = "INSERT INTO Module(Name) VALUES (" + "'" + Name + "');";
		stmt.executeUpdate(Create);		
	}
	
	/**
	 * List modules.
	 *
	 * @return the string
	 * @throws SQLException the SQL exception
	 */
	public String ListModules() throws SQLException {
		String SQL = "Select * FROM school.Module";
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(SQL);
		String out = " ";
		while(rs.next()) {
			int id = rs.getInt("MID");
			String fn = rs.getString("Name");
			out += id + " " +  fn + "\n";
		}
		System.out.println(out);
		return out;
		
	}

}
