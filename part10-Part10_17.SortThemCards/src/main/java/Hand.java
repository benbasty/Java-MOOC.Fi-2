
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    
    public Hand(){
        this.hand = new ArrayList<>();
        
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        //Iterator<Card> iterator = hand.iterator();
        //iterator.forEachRemaining(card -> System.out.println(card));
        for (Card card : this.hand) {
            System.out.println(card.toString());
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    @Override
    public int compareTo(Hand handValue){
        // hands are ranked based on the sum of values of its cards
        int firstValue = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
        int secondValue = handValue.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
        
        return firstValue - secondValue;
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
    
}
