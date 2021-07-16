package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    
    @Override
    public void start(Stage window){
        
        //components
        Label WelcomeText = new Label("Enter your name and start.");
        TextField name = new TextField();
        Button button = new Button("Start");
        
        //creating layout and adding components
        GridPane layout = new GridPane();
        layout.add(WelcomeText, 0, 0);
        layout.add(name, 0, 1);
        layout.add(button, 0, 2);
        
        //styling layout
        layout.setPrefSize(300, 200);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        //creating view and setting it to the layout
        Scene firstView = new Scene(layout);
        
        //creating a view for showing the welcome message
        Label welcomeText = new Label();
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 200);
        welcomeLayout.getChildren().add(welcomeText);
        layout.setAlignment(Pos.CENTER);
        
        Scene welcomeView = new Scene(welcomeLayout);
        
        // event handler
        button.setOnAction((event) -> {
            welcomeText.setText("Welcome " + name.getText() + "!");
            window.setScene(welcomeView);
        });
        
        window.setScene(firstView);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
