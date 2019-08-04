package org.sai.SamplePackage;

public class Sample {
// github repo creation

    public static void main(){
        System.out.println("Hello dear");
    }

    public void displayHello(String args){
        if(!args.isEmpty())
        System.out.println("Hello ");
        else
            System.out.println("Hello "+args);
    }

}
