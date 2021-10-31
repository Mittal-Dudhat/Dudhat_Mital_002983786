/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory()
    {
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addNewPerson(){
        Housing housing= new Housing();
        Person newPerson=new Person("",0,"",housing);
        personList.add(newPerson);
        return newPerson;
    }
    
    public void removePerson(int index)
    {
        personList.remove(index);
    }
}
