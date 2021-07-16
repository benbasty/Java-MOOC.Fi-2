package textstatistics;
import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
        TextArea ta = new TextArea();
        bp.setCenter(ta);
        
       
        HBox texts = new HBox();
        texts.setSpacing(10);
        
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is: ");
        
        texts.getChildren().addAll(lettersLabel, wordsLabel, longestWordLabel);
        bp.setBottom(texts);
        
        
        Scene view = new Scene(bp);
        window.setScene(view);
        window.show();
        
        //action listener
        ta.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            // set values of text elements
            lettersLabel.setText("Letters: " + String.valueOf(characters));
            wordsLabel.setText("Words: " + String.valueOf(words));
            longestWordLabel.setText("The longest word is: " + String.valueOf(longest));
        });

    }
    
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
