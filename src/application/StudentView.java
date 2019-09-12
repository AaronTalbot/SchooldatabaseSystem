package application;

import java.sql.SQLException;

import Controller.DatabaseController;
import Controller.StudentController;
import Model.*;
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
 * The Class StudentView.
 */
public class StudentView extends Tab {
	
	/** The Controller. */
	StudentController Controller;
	
	/**
	 * Instantiates a new student view.
	 *
	 * @param DC the dc
	 */
	public StudentView(DatabaseController DC) {
		Controller = DC.getSC();
		setText("Student");
		FlowPane FP = new FlowPane();
		Label L1 = new Label("Create a new Student Here(* must be completed) :");
		
		Label SN = new Label("Student First Name:*");
		
		Label SMN = new Label("Student Middle Name:");
		
		Label SLN = new Label("Student Last name:*");
	
		Label SEM = new Label("Student E-mail:*");
		
		Label SPN = new Label("Student Phone Number:*");
		
		Label SA = new Label("Student Age:*");
		
		Label CID = new Label("Class ID* :");
		
		Label ID = new Label("Remove a student with ID :");
		TextField Id = new TextField();
		
		TextField Fname = new TextField();
		TextField MiddleName = new TextField();
		TextField LastName = new TextField();
		TextField Email = new TextField();
		TextField Phone = new TextField();
		TextField Age = new TextField();
		TextField Class = new TextField();
		TextArea Display = new TextArea();
		
		
		Button Save = new Button("Save Student");
		Save.setOnAction(e-> {
			try {
				Controller.InstertStudent(Fname.getText(), MiddleName.getText(), LastName.getText(),Email.getText(),Phone.getText(), Age.getText(), Integer.parseInt(Class.getText()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}) ;
		
		Button ShowStudents = new Button("Show Students");
		ShowStudents.setOnAction(e-> {
			try {
				Display.setText(Controller.ListStudents());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		Button RemoveStudent = new Button("Remove Student");
		RemoveStudent.setOnAction(e -> {
			try {
				Controller.RemoveStudent(Id.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		HBox But = new HBox(Save,ShowStudents,RemoveStudent);
		
		VBox Vb1 = new VBox(L1,SN,Fname,SMN,MiddleName,SLN,LastName,SEM,Email,SPN,Phone,SA,Age,ID,Id, CID,Class,But,Display);
		
		
		FP.getChildren().add(Vb1);
		
		setContent(FP);		

		

		
		
	}

}
