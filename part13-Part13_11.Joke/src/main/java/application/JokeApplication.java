package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class JokeApplication extends Application{
    
    @Override
    public void start(Stage window){
        
        //main layout
        BorderPane layout = new BorderPane();
        
        //menu for layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        //create buttons for menu
        Button firstBtn = new Button("Joke");
        Button secondBtn = new Button("Answer");
        Button thirdBtn = new Button("Explanation");
        
        //adding all buttons to the menu
        menu.getChildren().addAll(firstBtn, secondBtn, thirdBtn);
        layout.setTop(menu);
        
        //add subviews for each buttons
        
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("Because a gummy bear has no teeth!");
        
        // event handlers when u press each buttons to change to the subviews
        firstBtn.setOnAction((event)->layout.setCenter(firstLayout));
        secondBtn.setOnAction((event)->layout.setCenter(secondLayout));
        thirdBtn.setOnAction((event)->layout.setCenter(thirdLayout));
        
        // Set initial view
        layout.setCenter(firstLayout);
        
        //main scene with layout
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.getChildren().add(new Label(text));
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
