package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloWorld extends Application
{
	
	private Stage primaryStage;
		
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		this.primaryStage = primaryStage;
		showRootPane();
		primaryStage.setTitle("Hello World");
//		Button btn = new Button("Say 'Hello World'");
//		btn.setOnAction(new EventHandler<ActionEvent>()
//		{
//			@Override
//			public void handle(ActionEvent event)
//			{
//				System.out.println("Hello World");
//			}
//		});
//		
//		StackPane root = new StackPane();
//		root.getChildren().add(btn);
//		primaryStage.setScene(new Scene(root, 300, 250));
//		primaryStage.show();
	}
	
	private void showRootPane() throws IOException
	{
		AnchorPane anchorPane;
		anchorPane = (AnchorPane) FXMLLoader.load(HelloWorld.class.getResource("/view/TitlePage.fxml"));
		Scene scene = new Scene(anchorPane, 600, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}