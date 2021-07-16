package notifier;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
        TextField topField = new TextField();
        Button button = new Button();
        Label label = new Label();
        
        button.setOnAction((event) -> {
            label.setText(topField.getText());
        });
        
        VBox componentGroup = new VBox();
        componentGroup.setSpacing(5);
        componentGroup.getChildren().addAll(topField, button, label);
        
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
