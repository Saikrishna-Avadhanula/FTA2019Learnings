package org.sai.SamplePackage.ComparatorTest;

import org.sai.SamplePackage.ComparablesTest.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student1Driver {



    public static  void main(String[] args){

        Student1 student;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Student1(101,"Avadh23", 25 ));
        arrayList.add(new Student1(102,"Avadh2", 22 ));
        arrayList.add(new Student1(103,"Avadh1", 29 ));

        System.out.println("Comparable on Name");
        Collections.sort(arrayList);
        Iterator iterator4 = arrayList.iterator();
        while(iterator4.hasNext()){
            student = (Student1) iterator4.next();
            System.out.println(student.sNo +"-->" +student.name+"--->"+student.age);
        }
        System.out.println("Name comparator");
        Collections.sort(arrayList,new NameComparator());
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            student = (Student1) iterator.next();
            System.out.println(student.sNo +"-->" +student.name+"--->"+student.age);
        }
        System.out.println("Age comparator");
        Collections.sort(arrayList,new AgeComparator());
        Iterator iterator2 = arrayList.iterator();
        while(iterator2.hasNext()){
            student = (Student1) iterator2.next();
            System.out.println(student.sNo +"-->" +student.name+"--->"+student.age);
        }
        System.out.println("sNo comparator");
        Collections.sort(arrayList,new SNoComparator());
        Iterator iterator3 = arrayList.iterator();
        while(iterator3.hasNext()){
            student = (Student1) iterator3.next();
            System.out.println(student.sNo +"-->" +student.name+"--->"+student.age);
        }
    }


}
