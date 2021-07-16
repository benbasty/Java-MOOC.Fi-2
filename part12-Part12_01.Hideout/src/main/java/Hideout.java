
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
public abstract class Hideout<T> implements List<T> {
    private List<T> hideoutList;
    
    public Hideout(){
        this.hideoutList = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if(!hideoutList.isEmpty()){
            hideoutList.clear();
            // In case an object is already in the hideout, it will disappear.
        }
        this.hideoutList.add(toHide);
        // puts an object into the hideout.
    }
    
    public T takeFromHideout(){
        if(this.hideoutList.isEmpty()){
            return null;
        } else{
            T value = this.hideoutList.get(0); //get object in hideout
            this.hideoutList.clear();//removes the object from the hideout
            return value; // return object in hideout
        }
        
    }
    
    public boolean isInHideout(){
        if(this.hideoutList.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
            
}
