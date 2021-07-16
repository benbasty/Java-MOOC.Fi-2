
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
 * @param <T>
 */
public abstract class Pipe<T> implements List<T> {
    private ArrayList<T> values; 
    
    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.values.add(value);
    }
    
    public T takeFromPipe(){
        if(this.values.isEmpty()){
            return null;
        } else {
            //get the value which has been in the pipe the longest
            T value = this.values.get(values.size()-1);
            //remove it from the pipe
            this.values.remove(value);
            return value;
        
        }
    }
    
    public boolean isInPipe(){
        if(this.values.isEmpty()){
            return false;
        } else {
            return true;
        }
            
    }
}
