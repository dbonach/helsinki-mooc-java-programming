/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbonach
 */
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        people = new ArrayList<>();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public boolean isEmpty() {
        return people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return new ArrayList<>(people);
    }
    
    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = people.get(0);
        
        for (Person p: people) {
            if (p.getHeight() < shortest.getHeight()) {
                shortest = p;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (people.isEmpty()) {
            return null;
        }
        
        
        Person p = this.shortest();
        // Make a copy to return, remove the original person and then return the copy
        p = new Person(p.getName(), p.getHeight());
        people.remove(this.shortest());
        
        return p;
    }
}
