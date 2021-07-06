
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> itemsInBox;
    
    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.itemsInBox = new ArrayList<>();
    }
    
     public void add(Packable itemToPack) {
        if (this.weight() + itemToPack.weight() <= maxCapacity) {
            itemsInBox.add(itemToPack);
        }
    }
    
    @Override
    public double weight() {
        double sum = 0; // initialize combined weights of all items
        for(Packable item: itemsInBox){
            sum += item.weight();
            
        }    
        return (double)sum;
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "Box: " + this.itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
