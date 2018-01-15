import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;


public class starter extends Application{
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/davin/UI/Home.fxml"));
            primaryStage.setTitle("Calculator By Davin");
            Scene scene = new Scene(root,900,480);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
