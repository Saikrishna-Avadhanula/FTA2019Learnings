package org.sai.SamplePackage.ComparatorTest;

import java.util.Comparator;

public class SNoComparator implements Comparator<Student1> {


    @Override
    public int compare(Student1 o1, Student1 o2) {
        if(o1.sNo == o2.sNo)
            return 0;
        else if(o1.sNo > o2.sNo)
            return 1;
        else
            return -1;
        
    }
}
