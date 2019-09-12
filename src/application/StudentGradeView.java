package application;

import java.sql.SQLException;

import Controller.DatabaseController;
import Controller.StudentGradeController;
import javafx.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;


// TODO: Auto-generated Javadoc
/**
 * The Class StudentGradeView.
 */
public class StudentGradeView extends Tab {
	
	/** The Controller. */
	private StudentGradeController Controller;
	
	/**
	 * Instantiates a new student grade view.
	 *
	 * @param DC the dc
	 */
	public StudentGradeView(DatabaseController DC) {
		FlowPane FP = new FlowPane();
		this.Controller = DC.getSG();
		setText("StudentGrade");
		
		Label SID = new Label("Enter Student ID : *");
		Label MID = new Label("Module ID : *");
		Label Grade = new Label("Enter Grade : *");
		
		TextField txtStudent = new TextField();
		TextField txtModule = new TextField();
		TextField txtgrade = new TextField();
		
		Button StoreGrade = new Button("Store Grade");
//		StoreGrade.setOnAction(e-> {
//			try {
//				//System.out.println(Student.getText() +  Module.getText() + grade.getText());
//			//	Controller.insertGrade(txtStudent.getText(),txtModule.getText(),txtgrade.getText());
//				Controller.insertGrade("1", "1", "64");
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		});		
		
		StoreGrade.setOnAction
		(e-> {
			try {
				Controller.insertGrade(
						txtStudent.getText(),
						txtModule.getText(),
						txtgrade.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		VBox V1 = new VBox(SID,txtStudent,MID,txtModule,Grade,txtgrade,StoreGrade);
		FP.getChildren().add(V1);
		
		setContent(FP);

		}
	

}
