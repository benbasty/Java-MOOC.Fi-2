package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{
    private HashMap<String, HashMap<Integer, Double>> values;
    
    public PartiesApplication() {
        this.values = readFile("partiesdata.tsv");
    }
    
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        launch(PartiesApplication.class);
    }
    
    
    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(1968,2008,4);
        NumberAxis yAxis = new NumberAxis(0,30,5);
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");
        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Relative support of the major Finnish parties");
        
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });
   
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
        
    }
    
    private HashMap<String, HashMap<Integer, Double>> readFile(String filename) {
        HashMap<String, HashMap<Integer, Double>> values1 = new HashMap<>();
        ArrayList<Integer> yearList = new ArrayList<>();

        try(Scanner data = new Scanner(Paths.get(filename))) {
            String row = data.nextLine();
            String[] stringArr = row.split("\t");
            for (int i = 1; i < stringArr.length; i++) { // skip first
                yearList.add(Integer.parseInt(stringArr[i]));
            }

            while (data.hasNext()) {
                String next = data.nextLine();
                stringArr = next.split("\t");
                String party = stringArr[0];
                HashMap<Integer, Double> map = new HashMap<>();
                for (int i = 1; i < stringArr.length; i++) {
                    if (!stringArr[i].equals("-")) {
                        int year = yearList.get(i-1);
                        String dat = stringArr[i];
                        double number = Double.parseDouble(dat);
                        map.put(year, number);
                    }

                }
                values1.put(party, map);
            }

        } catch(IOException e) {
            System.err.println("Error: " + e.toString());
        }

        return values1;
    }
        
        
        
}


