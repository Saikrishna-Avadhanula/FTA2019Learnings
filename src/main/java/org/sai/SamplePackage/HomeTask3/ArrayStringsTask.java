package org.sai.SamplePackage.HomeTask3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayStringsTask {
/*
    Collections:
            1. Write a program to find the missing number in integer array of 1 to 100 - 5 marks
            2. Write a program to find biggest and smallest number in a array.- 5 marks

    Strings:
            1. write a program to Print duplicate characters from String - 5 marks
            2. write a program to check if two strings are rotations of each other - 5 marks

    */
    public static void main(String[] args){
        ArrayStringsTask arrayStringsTask=new ArrayStringsTask();
        int[] num={1,2,3,4,6,7,8,9};
        int missingnum = arrayStringsTask.findMissingNuminArray(num,1);
        System.out.println("Missing Number: "+missingnum);
        arrayStringsTask.findMinMaxNumInArray(num);
        arrayStringsTask.printDuplicateCharInString("saikrishna");
    }

    public int findMissingNuminArray(int[] number, int startNum){
        boolean flag= true;
        int[] num= number;
        for(int i=0; i< num.length;i++){
            if(num[i]==startNum){
                startNum++;
            }
            else{
                flag= false;
                break;
            }
        }

        return flag?(-1):startNum ;
    }

    public void findMinMaxNumInArray(int[] number){
        int min = number[0],max = number[0];
        for(int i=1; i< number.length; i++){
            if(number[i] < min){
                min = number[i];
            }
            else if(number[i] >= max){
                max = number[i];
            }
        }
        System.out.println("Max Num = "+max+ " Min Num = "+min);


    }

    public void printDuplicateCharInString(String string) {
        if(!string.isEmpty()){
            char[] str = string.toCharArray();
            ArrayList<Character> charList = new ArrayList<Character>();
            System.out.println("Duplicate chars in array: ");
            for (char ele: str)
                if(charList.contains(ele))
                    System.out.print(ele+"\t");
                else
                    charList.add(ele);
        }

    }

    public void checkPalindrome(){

    }
}
