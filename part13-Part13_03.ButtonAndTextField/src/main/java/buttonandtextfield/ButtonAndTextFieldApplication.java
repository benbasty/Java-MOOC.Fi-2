package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {
    @Override
    public void start(Stage window){
        Button button = new Button();
        TextField textField = new TextField();
        
        FlowPane groupCmpnent = new FlowPane();
        groupCmpnent.getChildren().add(button);
        groupCmpnent.getChildren().add(textField);
        
        Scene view = new Scene(groupCmpnent);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
    

}
