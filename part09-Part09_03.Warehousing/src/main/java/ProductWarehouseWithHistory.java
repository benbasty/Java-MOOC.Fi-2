/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        this.changeHistory = new ChangeHistory();
        // Set the initial balance as the initial balance of the warehouse
        super.addToWarehouse(initialBalance);
        // the first value of the change history
        changeHistory.add(initialBalance);
    }
    public String history(){
        return this.changeHistory.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        //warehouse's balance after adding
        double result = (double) super.getBalance() + amount;
        
        // history to be added
        this.changeHistory.add(result);
        
        super.addToWarehouse(amount);
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        //warehouse's balance after adding
        double result = (double) super.getBalance() - amount;
        
        // history to be removed
        this.changeHistory.add(result);
        
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + changeHistory.toString());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
        
    
    }
}
