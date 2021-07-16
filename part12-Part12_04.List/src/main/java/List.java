/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class List<Type> {
    private Type[] values;
    private int firstIndex;
    
    //Creating a new list, constructor
    public List(){
        this.values = (Type[]) new Object[10];
        this.firstIndex = 0;   
    }
    
    //creates a new array whose size is 1.5 times the size of the old array
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }
    
    //Adding values to a list
    public void add(Type value){
        if(this.firstIndex == this.values.length){
            grow();
        }
        this.values[this.firstIndex] = value;
        this.firstIndex++;
    }
    
    //Checking the existence of a value
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }
    
    //removing a value
    
    // search for the index of given value;
    public int indexOfValue(Type value) {
        for(int i = 0; i < this.firstIndex; i++){
            if(this.values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    
    // moves values from the given index one place to the left
    
    private void moveToTheLeft(int fromIndex){
        for(int i = 0; i < this.firstIndex; i++){
            this.values[i] = this.values[i+1];
        }
    }
    
    //use the last two methods to remove
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if(indexOfValue < 0) {
            return;
        } 
        moveToTheLeft(indexOfValue);
        this.firstIndex--;
    }
    
    //Searching from an index
    public Type value(int index) {
        if(index < 0 || index >= this.firstIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstIndex + "]");
        }
        
        return this.values[index];
    }
    
    //size of the list
    public int size(){
        return this.firstIndex;
    }
    
    
    
    
    
}
