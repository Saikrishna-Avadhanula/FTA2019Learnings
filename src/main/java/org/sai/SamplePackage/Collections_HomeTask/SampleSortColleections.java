package org.sai.SamplePackage.Collections_HomeTask;

import java.util.*;

public class SampleSortColleections {


    public static void main( String[] aaargs){
        List  list = new ArrayList();

//        list.add(5);
//        list.add(4);
//        list.add(6);
        list.add("sai");
        list.add("krishna");
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        List lList= new LinkedList();
        lList.add(234);
        lList.add(123);
        lList.add(234);
//        lList.add('c');
//        lList.add("String");

        for (Object ob: lList
             ) {
            System.out.println(ob);
        }
        Collections.sort(list);

        Iterator<Integer> integerIterator = lList.listIterator();

            while(integerIterator.hasNext()){
                System.out.println(integerIterator.next());
        }

//            HashSet hs = new HashSet();

        LinkedList alist = new LinkedList();
        alist.add("Abc");
        alist.add("Abc");
        alist.add("abc");
        alist.add("abc");
            LinkedHashSet hs = new LinkedHashSet();
            hs.add("Ravi");
            hs.add("Tej");
            hs.add("Sai");
            hs.add("Ravi");
            hs.add("ravi");

            HashSet lhs = new HashSet(alist);
            Iterator i=lhs.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
        System.out.println(alist.contains("abc"));


//
//
//
//            Iterator ite = hs.iterator();
//            while (ite.hasNext()){
//                System.out.println(ite.next());
//            }







    }




}
