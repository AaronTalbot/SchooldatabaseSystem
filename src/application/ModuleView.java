package application;
import java.sql.SQLException;

import Controller.DatabaseController;
import Controller.ModuleController;
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
 * The Class ModuleView.
 */
public class ModuleView extends Tab {
	
	/** The mc. */
	ModuleController MC;



		
		/**
		 * Instantiates a new module view.
		 *
		 * @param DC the dc
		 */
		public ModuleView(DatabaseController DC) {
			this.MC = DC.getMC();
			setText("Modules");
			FlowPane FP = new FlowPane();
			Label L1 = new Label("Create a new Module Here(* must be completed) :");
			
			Label MN = new Label("Module Name:*");
			
			TextField Name = new TextField();
			
			Button Save = new Button("Save Module");
			Save.setOnAction(e-> {
				try {
					MC.AddModule(Name.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			TextArea Display = new TextArea();
			Button Show = new Button("Show Modules");
			Show.setOnAction(e-> {
				try {
					Display.setText(MC.ListModules());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
			HBox But = new HBox(Save,Show);
			VBox Vb1 = new VBox(L1,MN,Name,But,Display);
			
			
			FP.getChildren().add(Vb1);
			
			setContent(FP);		

			

			
			
		}

}
