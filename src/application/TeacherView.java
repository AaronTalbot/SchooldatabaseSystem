package application;

import java.sql.SQLException;

import Controller.DatabaseController;
import Controller.TeacherController;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// TODO: Auto-generated Javadoc
/**
 * The Class TeacherView.
 */
public class TeacherView extends Tab {
	
	/** The Controller. */
	TeacherController Controller;
	
	/**
	 * Instantiates a new teacher view.
	 *
	 * @param DC the dc
	 */
	public TeacherView(DatabaseController DC) {
		this.Controller = DC.getTC();
		setText("Teacher");
		FlowPane FP = new FlowPane();
		Label L1 = new Label("Create a new Teacher Here(* must be completed) :");
		
		Label TN = new Label("Teacher First Name:*");
		
		Label TMN = new Label("Teacher Middle Name:");
		
		Label TLN = new Label("Teacher Last name:*");
	
		Label TEM = new Label("Teacher E-mail:*");
		
		Label TPN = new Label("Teacher Phone Number:*");
		
		Label TD = new Label("Teacher Degree:*");
		
		TextField Fname = new TextField();
		TextField MiddleName = new TextField();
		TextField LastName = new TextField();
		TextField Email = new TextField();
		TextField Phone = new TextField();
		TextField Degree = new TextField();
		
		
		Label ID = new Label("Teacher ID ");
		TextField Id = new TextField();
		TextArea Display = new TextArea();
		

		Button Save = new Button("Save Teacher");
		Save.setOnAction(e-> {
			try {
				Controller.AddTeacher(Fname.getText(), MiddleName.getText(), LastName.getText(), Email.getText(), Phone.getText(), Degree.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Button List = new Button("List Teachers");
		List.setOnAction(e-> {
			try {
				Display.setText(Controller.ListTeachers());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Button Clear = new Button("Edit Degree");
		Clear.setOnAction(e->{
			try {
				Controller.EditTeacher(Id.getText(), Degree.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		HBox But = new HBox(Save,List,Clear);
		
		VBox Vb1 = new VBox(L1,TN,Fname,TMN,MiddleName,TLN,LastName,TEM,Email,TPN,Phone,TD,Degree, ID, Id, But,Display);
		
		
		FP.getChildren().add(Vb1);
		
		setContent(FP);
	}
	
	

}
