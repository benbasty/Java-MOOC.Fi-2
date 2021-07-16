
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
public class HashMap<K, V> {
    private ArrayList<Pair<K, V>> values = new ArrayList<>();
    private int numValues = 10;
    private int size;

    public HashMap() {
        for(int i = 0; i < numValues; i++){
            values.add(null);
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
    
        return size == 0;
    }
    
    private int getValueIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % numValues;
    
    }
    
    public V get(K key) {
        
        int index = getValueIndex(key);
        Pair<K,V> head = values.get(index);
        while(head != null) {
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    
    public V remove(K key){
        int index = getValueIndex(key);
        Pair<K,V> head = values.get(index);
        if(head == null ){
            return null;
        }
        if(head.key.equals(key)){
            V val = head.value;
            head = head.next;
            values.set(index, head);
            size--;
            return val;
            
        } else {
            Pair<K,V> prev = null;
            while(head!=null){
				
                if(head.key.equals(key))
                {
                        prev.next=head.next;
                        size--;
                        return head.value;
                }
                prev=head;
                head=head.next;
            }
            size--;
            return null;
        }
    
    }
    
    public void add(K key,V value) {
		
        int index = getValueIndex(key);
        System.out.println(index);
        Pair<K, V> head = values.get(index);
        Pair<K, V> toAdd = new Pair<>();
        toAdd.key = key;
        toAdd.value = value;
        if(head==null) {
            values.set(index, toAdd);
            size++;
        }
        else {
            while(head!=null) {
                if(head.key.equals(key))
                {
                        head.value=value;
                        size++;
                        break;
                }
                head=head.next;
            }
        if(head==null) {
            head=values.get(index);
            toAdd.next=head;
            values.set(index, toAdd);
            size++;
        }
        }
        if((1.0*size)/numValues>0.7) {
            //do something
            ArrayList<Pair<K, V>>tmp = values;
            values = new ArrayList<>();
            numValues = 2 * numValues;
            for(int i=0;i < numValues; i++) {
                    values.add(null);
            }
            for(Pair<K, V> headNode:tmp) {
                while(headNode!=null) {
                        add(headNode.key, headNode.value);
                        headNode=headNode.next;
                }
            }


        }
		
    }
    
    
}
