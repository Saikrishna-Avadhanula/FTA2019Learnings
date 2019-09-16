package org.sai.SamplePackage.ComparablesTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentDriver {

    public static void main(String[] args){

        Student student;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Student(101,"Avadh1", 25 ));
        arrayList.add(new Student(102,"Avadh2", 22 ));
        arrayList.add(new Student(103,"Avadh3", 29 ));

        Collections.sort(arrayList);

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            student = (Student) iterator.next();
            System.out.println(student.age);
        }

    }


}
