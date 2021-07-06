
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class Herd implements Movable{
    
    private List<Movable> herdList;
    
    public Herd(){
        this.herdList = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herdList.add(movable);
    
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable move : herdList){
            move.move(dx, dy);
        }
    
    }
    
    @Override
    public String toString(){
        String newStr = "";
        for(Movable move: herdList){
            newStr += move.toString().trim() + "\n";
        }
        return newStr;
    } 
}
