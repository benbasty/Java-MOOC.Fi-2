/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class TripleTacoBox implements TacoBox{
    private int tacos;
    public TripleTacoBox(){
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        if(tacos != 0){
            tacos--;
        } //To change body of generated methods, choose Tools | Templates.
    }
    
}
