package org.sai.SamplePackage;

import java.util.Scanner;

public class Sample {
// github repo creation

    public static void main(String[] args){
        System.out.println("Hello dear");
        try{
            Scanner scanner = new Scanner(System.in);
            int[] arr= new int[]
            {0, 1, 2, 3, 6, 4, 5};
            System.out.println(arr.length);
            System.out.println(arr[0]);
            int res=0;
            for(int i=0; i<=arr.length; i++){
                res=arr[i]+res;
            }
            System.out.println(res);
        }
        finally
        {

        }




    }

    public void displayHello(String args){
        if(!args.isEmpty())
        System.out.println("Hello ");
        else
            System.out.println("Hello "+args);
    }

}
