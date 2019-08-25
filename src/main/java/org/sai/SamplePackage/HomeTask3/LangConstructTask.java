package org.sai.SamplePackage.HomeTask3;

public class LangConstructTask {



        public static void main(String[] args){
            LangConstructTask langConstructTask = new LangConstructTask();
//            langConstructTask.computeDrive(5,true);
//            langConstructTask.computeDrive(60,false);
//            langConstructTask.computeDrive(61,false);
//            langConstructTask.computeDrive(84,false);
//
//            langConstructTask.greatNumSix(6,1);
//            langConstructTask.greatNumSix(0,6);
//            langConstructTask.greatNumSix(2,5);
//            langConstructTask.greatNumSix(-3,-3);
//            langConstructTask.greatNumSix(-9,3);
            langConstructTask.party(5,5);
            langConstructTask.party(0,5);
            langConstructTask.party(4,8);
            langConstructTask.party(10,5);
            langConstructTask.party(15,10);


        }

        /*
        You have a  blue lottery ticket, with ints a, b, and c on   it.
        This makes three pairs, which we'll call ab, bc, and ac.
        Consider the sum of the numbers in   each pair.
        If any pair sums to   exactly 10, the result is   10.
        Otherwise if   the ab   sum is exactly 10 more than either bc or   ac   sums, the result is 5.
        Otherwise the result is 0.
         */
        public int lottery(int a, int b, int c){
            int res=0;
            if((a+b)==10 || (b+c) ==10 || (c+a) ==10){
                res=10;
            }
            else if((a+b)>10){
                if( (a+b)>(b+c) || (a+b)>(b+c))
                    res=5;
            else
                res=0; }
            return res;
        }


/*    You are driving a  little too fast, and a  police officer stops you. Write code to compute the result,
        encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
        If speed is   60 or   less, the result is   0.
        If speed is   between 61   and 80 inclusive, the result is   1.
        If speed is 81 or   more, the result is   2.
        Unless it is your birthday -- on that day, your speed can be   5 higher in all cases.
*/

        public int computeDrive(double speed, boolean birthday){
            int res;
            if(birthday)
                res =5;
            else{
                if(speed <= 60)
                    res =0;
                else if(speed <= 80)
                    res =1;
                else
                    res=2;
                }
            System.out.println(res);
            return res;
        }


        /*
        The number 6 is   a  truly great number.
        Given two int values, a  and b, return true if either one is 6.
        Or if   their sum or difference is  6.
        Note: the function Math.abs(num) computes the absolute value of a number.
         */
        public boolean greatNumSix(int a, int b){
            boolean flag = false ;
            if(a==6 || b==6 || Math.abs((a+b)) ==6 || Math.abs((a-b))==6)
                flag = true;
            System.out.println(flag);
            return flag;
        }

        /*
        We are having a party with amounts of   tea and candy.
        Return the int outcome of   the party encoded as 0=bad, 1=good, or   2=great.
        A  party is good (1) if both tea and candy are at   least 5. However,
        if either tea or candy is at least double the amount of the other one, the party is great (2).
        However, in all cases, if   either tea or candy is less than 5, the party is always bad (0).
         */

        public int party(int tea , int candy){
            int res;
            if(tea <5 || candy <5)
                res=0;
            else {
                if (tea == (candy * 2) || (tea * 2) == candy)
                    res = 2;
                else
                    res = 1;
            }
            System.out.println("Tea:"+tea+"\tCandy"+candy+"\tResult"+res);
            return res;
        }


}

