package org.sai.SamplePackage.Collections_HomeTask;

import TestBase.LoggerBase;

import java.util.ArrayList;

public class CollectionsLearnings extends LoggerBase {

    public static void main(String[] args){
        CollectionsLearnings collectionsLearnings = new CollectionsLearnings();
        collectionsLearnings.ArrayListLearn();

    }


    public void ArrayLearn(){
        int arr[] = new int[2];

        System.out.println(arr[0]+" "+arr[1]);
    }

    public void ArrayListLearn(){
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<Boolean> list= new ArrayList<Boolean>();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(true);
        list.add('c');
        list.add("string");
        list.add(1.5);
        list.add(1.4f);

        System.out.println(list.get(3));
        list.remove(3);
        System.out.println(list.get(3));
        list.add(3,false);
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        list2.addAll(list);
        list.clear();
        list.add("List1");
        list.add(list.size(),24);
        for( int i= list.size()-1; i>=0 ; i--){
            System.out.println(list.get(i));
        }
        for( int i= list2.size()-1; i>=0 ; i--){
            System.out.println(list2.get(i));
        }




        Object[] obj = list2.toArray();

        for (Object o: obj) System.out.println(o);




    }


}
