package org.sai.SamplePackage.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleSortColleections {


    public static void main( String[] aaargs){
        List  list = new ArrayList();

        list.add(5);
        list.add(4);
        list.add(6);

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }




    }




}
