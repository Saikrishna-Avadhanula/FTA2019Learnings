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
//            langConstructTask.party(5,5);
//            langConstructTask.party(0,5);
//            langConstructTask.party(4,8);
//            langConstructTask.party(10,5);
//            langConstructTask.party(15,10);

            langConstructTask.inOrder(1, 2, 4, false) ;
            langConstructTask.inOrder(1, 2, 1, false);
            langConstructTask.inOrder(1, 1, 2, true);

            langConstructTask.shareDigit(12, 23);
            langConstructTask.shareDigit(12, 43);
            langConstructTask.shareDigit(12, 44);

        }

/*
Given a  string, return the length of the largest "block" in the string. A block is a  run of   adjacent chars that are the same.maxBlock("hoopla") ? 2maxBlock("abbCCCddBBBxx") ? 3maxBlock("") ? 0Test your logic at   : http://codingbat.com/prob/p1794
 */


    public int maxBlock(String str) {
        int max=0;
        int temp=1;
        if(str.length()==1)
            max= 1;
        if(str.length()==0)
            max= 0;
        if(str.length()>1) {
            char[] ch = str.toCharArray();
            for (int i = 1; i < ch.length; i++) {
                if(ch[i]==ch[i-1])
                {temp++;
                    if(i==ch.length-1){
                        if(temp>max)
                            max=temp;
                    }}
                else{
                    if(temp>max)
                        max=temp;
                    temp=1;}
            }

        }
        return max;
    }




        /*
        Given two strings, base and remove, return a  version of the basestring where all instances of   the remove string have been removed (not case sensitive). You may assume that the remove string is length 1  or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".withoutString("Hello there", "llo") ?  "He there"withoutString("Hello there", "e") ?  "Hllo thr"withoutString("Hello there", "x") ?  "Hello there"Test your logic at   : http://codingbat.com/prob/p192570
         */

    public String withoutString(String base, String remove) {
        remove = "(?i)"+remove;
        return base.replaceAll(remove,"");

    }

/*
Given 2  non-negative ints, a and b,   return their sum, so   long as thesum has the same number of   digits as   a.   If the sum has more digits than a,   just return a  without b.   (Note: one way to compute the number
of   digits of   a non-negative int n  is   to   convert it to a  string withString.valueOf(n) and then check the length of the string.)sumLimit(2, 3)   ?  5sumLimit(8, 3)   ?  8sumLimit(8, 1)   ?  9Test your logic at   :http://codingbat.com/prob/p1180
 */

    public int sumLimit(int a, int b) {
        int sum = a+b;
        if(String.valueOf(sum).length() > String.valueOf(a).length())
            return a;
        return a+b;
    }


    /*
        Given two ints, each in   the range 10..99, return true if   there is a digit that appears in both numbers, such as the 2  in 12   and 23. (Note: division, e.g. n/10, gives the left digit while the %  "mod" n%10 gives the right digit.)shareDigit(12, 23) ? trueshareDigit(12, 43) ? falseshareDigit(12, 44) ? falseTest your logic at   : http://codingbat.com/prob/p1537
         */
        public boolean shareDigit(int a, int b) {
            if(returnLeft(a)==returnLeft(b) || returnLeft(a)==returnRight(b) || returnRight(a) == returnLeft(b) || returnRight(a)==returnRight(b))
                return true;
            else
                return false;
        }
        private int returnLeft(int x){
            return x/10;
        }
        private int returnRight(int x){
            return x%10;
        }



        /*
        Given three ints, a b  c, return true
        if   b is greater than a, and c is greater than b.
        However, with the exception that if "bOk" is   true,
        b does not need to be   greater than a.
        inOrder(1, 2, 4, false) ?  true
        inOrder(1, 2, 1, false) ?  false
        inOrder(1, 1, 2, true) ?  true
        Test your logic at   :http://codingbat.com/prob/p1541
         */
        public boolean inOrder(int a, int b, int c, boolean bOk){
            boolean bool=true;
            if(bOk)
            return c>b?true:false;
            if(b>a && c>b)
                return true;
            else
                return false;

//            return bool;
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

