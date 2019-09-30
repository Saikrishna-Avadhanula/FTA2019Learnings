package org.sai.DesignPattern.Builder;

import java.util.ArrayList;

public class PersonGroup {

    ArrayList<Person> personArrayList = new ArrayList<Person>();

    public void addPerson(Person person){
        personArrayList.add(person);
    }


}
