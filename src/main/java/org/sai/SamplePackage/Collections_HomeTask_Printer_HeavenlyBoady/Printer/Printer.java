package org.sai.SamplePackage.Collections_HomeTask_Printer_HeavenlyBoady.Printer;

import TestBase.LoggerBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Printer extends LoggerBase
{
    LoggerBase loggerBase;
    public void printArray(Object[] arrays){
      //  Write your code here…

        List<Object> objectList = new ArrayList<Object>();
        objectList.addAll(Arrays.asList(arrays));

        Iterator<Object> objectIterator = objectList.iterator();
        while(objectIterator.hasNext()){
            LoggerBase.info(objectIterator.next());
        }

    }

    public static void main(String args[]) {
        Printer arr = new Printer ();

        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        LoggerBase.info("Array integerArray contains:");
        LoggerBase.info("Printing Array of integerArray");
        arr.printArray(integerArray); // pass an Integer array
        LoggerBase.info("\nArray doubleArray contains:");
        LoggerBase.info("Printing Array of doubleArray");
        arr.printArray(doubleArray); // pass a Double array
        LoggerBase.info("\nArray characterArray contains:");
        LoggerBase.info("Printing Array of doubleArray");
        arr.printArray(characterArray); // pass a Character array
    }

}

