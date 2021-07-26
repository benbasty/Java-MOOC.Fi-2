package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application{

    @Override
    public void start(Stage window){
        Canvas paintingCanvas = new Canvas(400, 400);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        drawShapes(painter);

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
     
    }
        private void drawShapes(GraphicsContext graphicContext){
            
            graphicContext.setFill(Color.BLACK);
            graphicContext.fillRect(130, 60, 25, 25); //left eye
            graphicContext.fillRect(260, 60, 25, 25); //right eye
            graphicContext.fillRect(135, 200, 150, 25); //mouth line
            graphicContext.fillRect(110, 175, 25, 25); //leeft mouth corner
            graphicContext.fillRect(284, 175, 25, 25);//right mouth courner
        }
    
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
