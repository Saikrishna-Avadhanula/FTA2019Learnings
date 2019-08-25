package org.sai.SamplePackage.HomeTask3;

public class PyramidClass {

    public void generateWhilePyramid(int lines, int multiples){
        int num=0,i=1;
        while(i<=lines){
            for(int j=1; j<=i ; j++){
                System.out.print(num +"\t");
                num= num+multiples;
            }
            System.out.print("\n");
            i++;
        }

    }

    public void generateDoWhilePyramid(int lines, int multiples){
        int num=0,i=1;
        if(lines>0)
            do{
                for(int j=1; j<=i ; j++){
                    System.out.print(num +"\t");
                    num= num+multiples;
                }
                System.out.print("\n");
            i++;
            }while(i<=lines);
    }

    public void generateForPyramid(int lines, int multiples){
        int num=0;

        for(int i=1; i<=lines ;i++ ){

            for(int j=1; j<=i ; j++){
                System.out.print(num +"\t");
                num= num+multiples;
            }
            System.out.print("\n");
        }

    }


}
