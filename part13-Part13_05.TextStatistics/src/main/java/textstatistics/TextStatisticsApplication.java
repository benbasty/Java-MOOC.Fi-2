package textstatistics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application{
    
    @Override
    public void start(Stage window){
        BorderPane bp = new BorderPane();
        bp.setCenter(new TextArea(""));
        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("Letters: 0"));
        texts.getChildren().add(new Label("Words: 0"));
        texts.getChildren().add(new Label("The longest word is:"));
        bp.setBottom(texts);
        
        Scene view = new Scene(bp);
        window.setScene(view);
        window.show();
    
    }
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
