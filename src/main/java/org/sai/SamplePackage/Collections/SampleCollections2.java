package org.sai.SamplePackage.Collections;

import java.util.*;

public class SampleCollections2 {
    /*
    asynchronised
    Duplicates allowed
    ArrayList     >>>>> Dynamic array, index based
    LinkedList    >>>>> follow linked data structuress, follows insertion order Queue kind

    Duplicates not allowed
    LinkedHashSet >>>>> Insertion order no sorting is available
    TreeSet       >>>>> stored in Ascending order, Generics should be given
    HashSet       >>>>> allows nulls



     */
    public static void main(String[] args){


        ArrayList    arrayList      = new ArrayList();
        LinkedList   linkedList     = new LinkedList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TreeSet     treeSet         = new TreeSet();
        HashSet     hashSet         = new HashSet();

//        add(arrayList);
//        add(linkedList);
//        add(linkedHashSet);
//        add(treeSet);
        add(hashSet);

//        print(arrayList);
//        print(linkedList);
//        print(linkedHashSet);
//        print(treeSet);
        print(hashSet);

    }
    public static void add(List list){
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add("SAI");
        list.add("sai");
        list.add("SaI");
        list.add(5.5);
        list.add(null);

    }
    public static void add(Set list){
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add("SAI");
        list.add("sai");
        list.add("SaI");
        list.add(5.5);

    }
    public static void print(List list){
        System.out.println("-------------"+list.toString()+"---------------");
        System.out.println("-------------"+list.getClass().getSimpleName()+"---------------");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void print(Set list){
        System.out.println("-------------"+list.toString()+"---------------");
        System.out.println("-------------"+list.getClass().getSimpleName()+"---------------");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
