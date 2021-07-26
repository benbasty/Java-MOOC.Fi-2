package hurraa;


import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);

        URL url = getClass().getResource("Applause-Yannick_Lemieux.wav");
        AudioClip clip = Applet.newAudioClip(url);
     
        nappi.setOnAction((event) -> {
            clip.play();
        });
        
        
        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
