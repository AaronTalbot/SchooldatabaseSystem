package application;
import Model.*;
import Controller.*;

	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;


// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main extends Application {
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			DatabaseController DB = new DatabaseController();
			BorderPane mainPane = new BorderPane();
			Group root = new Group();
			Scene scene = new Scene(root,600,600);
			TabPane tp = new TabPane();
			tp.getTabs().add(new ClassView(DB));
			tp.getTabs().add(new StudentView(DB));
			tp.getTabs().add(new ModuleView(DB));
			tp.getTabs().add(new TeacherView(DB));
			tp.getTabs().add(new StudentGradeView(DB));
			mainPane.setCenter(tp);
			
		    root.getChildren().add(mainPane);
		    primaryStage.setScene(scene);
		    primaryStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
