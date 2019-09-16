package org.sai.SamplePackage.ComparablesTest;

public class Student implements Comparable<Student> {

    int age;
    String name;
    int sNo;

    Student(int sNo, String name, int age){
        this.sNo = sNo;
        this.name = name;
        this.age = age;
    }



    public int compareTo(Student student) {
        if(age == student.age)
            return 0;
        else if(age >student.age)
            return 1;
        else
            return -1;
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
