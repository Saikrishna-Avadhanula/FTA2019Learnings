package org.sai.SamplePackage.HomeTask3;

import java.util.ArrayList;
import java.util.List;

public class Pract {

    public static void main(String[] args){
        Pract p = new Pract();
        p.sumNum("");
    }


    public int sumNum(String str){
        int res=0;
        String tempNum="";
        char[] ch = str.toCharArray();
        List<String> strr = new ArrayList<String>();
        for(int i=0; i<ch.length ;i++){
            if(Character.isDigit(ch[i])){
                tempNum=tempNum+ch[i];
            }
            if(!Character.isDigit(ch[i])){
                if(tempNum.length()>0)
                    strr.add(tempNum);
                tempNum="";
            }
        }
        if(tempNum!="")
            strr.add(tempNum);
        for (int cou=0; cou<strr.size();cou++
             ) {
            res = res+Integer.parseInt(strr.get(cou));
        }

        return res;
    }








}
