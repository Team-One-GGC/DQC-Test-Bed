package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MyController implements Initializable
{
	private String text="";
	
	@FXML
	private Label titleLabel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		this.text = "My text";
	}
	
	@FXML
	private void changeScene(ActionEvent e)
	{
		Button b = (Button) e.getSource();
		String buttonName = b.getText();

		if(buttonName.equals("Create"))
		{
			System.out.println("Create was clicked");
			titleLabel.setText("Create was clicked");
		}
		if(buttonName.equals("Edit"))
		{
			System.out.println("Edit was clicked");
			titleLabel.setText("Edit was clicked");
		}
		if(buttonName.equals("View"))
		{
			System.out.println("View was clicked");
			titleLabel.setText("View was clicked");
		}
	}
	
	@FXML
	private void menuItemClicked()
	{
		System.out.println(text);
	}
}
