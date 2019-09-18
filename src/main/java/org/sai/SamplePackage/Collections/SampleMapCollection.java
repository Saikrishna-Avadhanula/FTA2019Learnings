package org.sai.SamplePackage.Collections;

import java.util.*;

public class SampleMapCollection {
    public static void main(String[] args){

//        Hashtable<Integer,String> hashtable = new Hashtable<Integer, String>();
        HashMap<Integer,String>   hashtable   = new HashMap<Integer, String>();

        /*
        Hashtable are synchronised, doesn't allow null values
        HashMaps are unsynchronised, allow null values..
        LinkedHashMaps are unsynchronised, allows null values..
        TreeMap are unsynchronised
         */


        hashtable.put(1,"Avadhanula");
        hashtable.put(2,"Sai");
        hashtable.put(3,"Krishna");
        hashtable.put(4,null);

        Set<Integer> set = hashtable.keySet();
        Iterator<Integer> integerIterator = set.iterator();
        while(integerIterator.hasNext()){
            Integer key = integerIterator.next();
            System.out.println(key+"---------"+hashtable.get(key));
        }


        hashtable.put(1,"Avadhanula_update");
        hashtable.put(2,"Sai_update");
        hashtable.put(3,"Krishna_update");
        hashtable.put(null,"Test");
//        hashtable.

        for (Map.Entry mapEntry: hashtable.entrySet()) {
            System.out.println(mapEntry.getClass().getSimpleName()+"------->"+mapEntry.getKey()+"-----"+mapEntry.getValue());
        }

//        hashMap.remove(1);



    }



}
