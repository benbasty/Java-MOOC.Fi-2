
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
public class MisplacingBox extends Box {
    private ArrayList<Item> misplacingBox;
    
    public MisplacingBox(){
        this.misplacingBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        misplacingBox.add(item); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInBox(Item item) {
        return false; //To change body of generated methods, choose Tools | Templates.
    }
    
}
