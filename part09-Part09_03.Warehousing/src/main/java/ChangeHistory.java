
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    public void add(double status){
        this.history.add(status);
    }
    public void clear(){
        this.history.clear();
    }
    @Override
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0.0;
        } else {
            return Collections.max(this.history);
        }
        
    }
    
    public double minValue() {
        if(this.history.isEmpty()){
            return 0.0;
        } else {
            return Collections.min(this.history);
        }
    }
    
    public double average() {
        double sum = 0;
        if(this.history.isEmpty()){
            return sum;
        } else {
            for(int i = 0; i < this.history.size(); i++){
               sum += this.history.get(i); 
            }
            return 1.0 * sum / this.history.size();
        }
    }
    
}
