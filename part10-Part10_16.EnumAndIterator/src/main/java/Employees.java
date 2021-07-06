
import java.util.ArrayList;
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
public class Employees {
    private List<Person> persons;
    
    public Employees(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        Iterator<Person> iterator = peopleToAdd.iterator();
        iterator.forEachRemaining(person -> persons.add(person));
    
    }
    
    public void print(){
        Iterator<Person> iterator = persons.iterator();
        iterator.forEachRemaining(employee -> System.out.println(employee));
    }
    
    public void print(Education education){
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
