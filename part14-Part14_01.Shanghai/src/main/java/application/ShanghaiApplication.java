package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class ShanghaiApplication extends Application{

    public static void main(String[] args) {
        
        //System.out.println("Hello world!");
        launch(ShanghaiApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(2007,2017,2);
        NumberAxis yAxis = new NumberAxis(0,100,10);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle("University Of Helsinki, Shanghai Ranking");
        
        XYChart.Series shghaiApp = new XYChart.Series();
        shghaiApp.setName("University Of Helsinki, Shanghai Ranking");
        
        shghaiApp.getData().add(new XYChart.Data(2007, 73));
        shghaiApp.getData().add(new XYChart.Data(2008, 68));
        shghaiApp.getData().add(new XYChart.Data(2009, 72));
        shghaiApp.getData().add(new XYChart.Data(2010, 72));
        shghaiApp.getData().add(new XYChart.Data(2011, 74));
        shghaiApp.getData().add(new XYChart.Data(2012, 73));
        shghaiApp.getData().add(new XYChart.Data(2013, 76));
        shghaiApp.getData().add(new XYChart.Data(2014, 73));
        shghaiApp.getData().add(new XYChart.Data(2015, 67));
        shghaiApp.getData().add(new XYChart.Data(2016, 56));
        shghaiApp.getData().add(new XYChart.Data(2017, 56));
        
        lineChart.getData().add(shghaiApp);
        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }


}
