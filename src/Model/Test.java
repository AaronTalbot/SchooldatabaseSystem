package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class Test.
 */
public class Test {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		School t = new School(0001);
		ClassGroup CD = new ClassGroup(0, null); //you spelled null wrong idiot
		t.AddClass(CD);
		Student s = new Student("Aaron", "Talbot","AT@gmail.com",83457439,00160716);
		CD.addStudent(s);
		String Create = "INSERT INTO student(First_Name,Middle_Name,Last_Name,Email,Phone_Number,Date_Of_Birth) VALUES (";
		
		try {
			// Conection Made
			Connection MyConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","97560");
			// Creating a satement
			Statement myStmt = MyConn.createStatement();
			Create += "'" + s.getName().getFname() + "'" + "," + null + "," + "'" + s.getName().getLname() + "'" + "," + "'" + s.getEmail()
			+ "'" + "," + s.getPhoneNum() + "," + s.getDOB() + ");";
			//String stmt = ("insert into student values(" + 1  + "," + "'James'" + ", " + "null" + ", " + "'Franco'" + ", " + "'JF@gmail.com'" + ", " + 86457439 +", " + 22 + ")");
			myStmt.execute(Create);

			System.out.println("It worked");

	}
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
