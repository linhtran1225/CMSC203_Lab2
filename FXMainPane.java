

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button button1, button2, button3, button4, button5, button6;
	Label myLabel;
	TextField textField;
	//  declare two HBoxes
	HBox hbox1;
	HBox hbox2;
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button4 = new Button("Clear");
		button5 = new Button("Exit");
		button6 = new Button("Vietnamese");
		myLabel = new Label("Feedback:");
		textField = new TextField();
		//  instantiate the HBoxes
		hbox1 = new HBox();
		hbox2 = new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		dManager = new DataManager();
		//  set margins and set alignment of the components
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		HBox.setMargin(myLabel, new Insets(0, 10, 0, 0));
		HBox.setMargin(button1, new Insets(10, 20, 10, 0));
		HBox.setMargin(button2, new Insets(10, 20, 10, 0));
		HBox.setMargin(button3, new Insets(10, 20, 10, 0));
		HBox.setMargin(button4, new Insets(10, 20, 10, 0));
		HBox.setMargin(button5, new Insets(10, 20, 10, 0));
		HBox.setMargin(button6, new Insets(10, 20, 10, 0));
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hbox1.getChildren().addAll(myLabel, textField);
		//  add the buttons to the other HBox
		hbox2.getChildren().addAll(button1, button2, button3, button6, button4, button5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hbox1, hbox2);
		//Task #4:
		//  create a private inner class to handle the button clicks
		button1.setOnAction(new EventHandler<ActionEvent>()  {
			public void handle(ActionEvent event) {
				textField.setText(dManager.getHello());
			}
		});
		button2.setOnAction(new EventHandler<ActionEvent>()  {
			public void handle(ActionEvent event) {
				textField.setText(dManager.getHowdy());
			}
		});
		button3.setOnAction(new EventHandler<ActionEvent>()  {
			public void handle(ActionEvent event) {
				textField.setText(dManager.getChinese());
			}
		});
		button4.setOnAction(new EventHandler<ActionEvent>()  {
			public void handle(ActionEvent event) {
				textField.setText("");
			}
		});
		button5.setOnAction(new EventHandler<ActionEvent>()  {
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
		button6.setOnAction(new EventHandler<ActionEvent>()  {
			public void handle(ActionEvent event) {
				textField.setText(dManager.getVietnamese());
			}
		});
	}
}
	
