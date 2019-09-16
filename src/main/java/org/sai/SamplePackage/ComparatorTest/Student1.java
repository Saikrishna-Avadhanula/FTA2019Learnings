package org.sai.SamplePackage.ComparatorTest;

public class Student1 implements Comparable<Student1> {

    int age;
    String name;
    int sNo;

    Student1(int sNo, String name, int age){
        this.sNo = sNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student1 o) {
        return name.compareTo(o.name);
    }
}
