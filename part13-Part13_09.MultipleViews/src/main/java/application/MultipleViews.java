package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window){
        
        //first view
        BorderPane bp = new BorderPane();
        Label l1 = new Label("First view!");
        Button button = new Button("To the second view!");
        bp.setTop(l1);
        bp.setCenter(button);
        Scene view1 = new Scene(bp, 300, 300);
        
        //second view
        VBox vb = new VBox();
        Button bt = new Button("To the third view!");
        Label secondLabel = new Label("Second view");
        vb.getChildren().addAll(bt,secondLabel);
        Scene view2 = new Scene(vb, 300, 300);
        
        //third view
        GridPane gp = new GridPane();
        Button thirdBtn = new Button("To the first view");
        Label thirdLabel = new Label("Third view");
        gp.add(thirdLabel, 0, 0);
        gp.add(thirdBtn, 1, 1);
        Scene view3 = new Scene(gp);
        
        /// events listener
        button.setOnAction(event -> {
            window.setScene(view2);
        });
        bt.setOnAction(event -> {
            window.setScene(view3);
        });
        thirdBtn.setOnAction(event -> {
            window.setScene(view1);
        });

        // first secene and show window
        window.setScene(view1);
        window.show(); 
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
