package application;

import java.sql.SQLException;

import Controller.ClassController;
import Controller.DatabaseController;
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
 * The Class ClassView.
 */
public class ClassView extends Tab{
	
	/** The cc. */
	ClassController CC;
	  
	/**
	 * Instantiates a new class view.
	 *
	 * @param DC the dc
	 */
	public ClassView(DatabaseController DC) {
		this.CC = DC.getCC();
		setText("Class");
		FlowPane FP = new FlowPane();
		Label L1 = new Label("Create a new Class Here(* must be completed) :");
		Label CN = new Label("Class Name:*");
		
		TextArea Display = new TextArea();
		
		TextField Name = new TextField();
		
		Button Save = new Button("Save Class");
		Save.setOnAction(e-> {
			try {
				CC.CreateClass(Name.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Button Clear = new Button("Display Classes");
		Clear.setOnAction(e -> {
			try {
				Display.setText(CC.GetClasses());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		HBox But = new HBox(Save,Clear);
		
		VBox v1 = new VBox(L1,CN,Name,But,Display);
		
		FP.getChildren().add(v1);
		
		setContent(FP);
		
		
		
		
	}

}
