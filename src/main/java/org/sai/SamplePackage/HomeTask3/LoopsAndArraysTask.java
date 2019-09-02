package org.sai.SamplePackage.HomeTask3;

public class LoopsAndArraysTask {
    public static  void main(String[] args){

        LoopsAndArraysTask loopsAndArraysTask = new LoopsAndArraysTask();
        int[] nums = {1, 2, 1, 1, 3};
//        System.out.println("Res::"+loopsAndArraysTask.maxSpan(nums));
        System.out.println("Res::"+ loopsAndArraysTask.countClumps(nums));

    }



    /*
    3. Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1

Test your code at : http://codingbat.com/prob/p193817
     */
    public int countClumps(int[] nums) {

        int maxClump=0,tempClump=0,cur,prev, len =nums.length-1;

        do{


            if(nums[len] == nums[len-1]){
                tempClump++;
            }else{
                if(tempClump > maxClump){
                    maxClump = tempClump;
                }
            }


            len--;
        }while(len<1);


        return maxClump;
    }





    /*

2. Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true

Test your code at :http://codingbat.com/prob/p158767
     */

    public boolean canBalance(int[] arr) {
        boolean bool=false;
        if(arr.length<2)
            bool = false;
        else{
            int left=1;
            while(!bool && left < arr.length){
                bool = check(arr, left);
                left++;
            }
        }
        return bool;

    }

    private boolean check(int[] arr, int left){
        int lsum=0,rsum=0;
        for(int i=0; i<left ; i++){
            lsum = lsum+arr[i];
        }
        for(int i=left; i<arr.length; i++){
            rsum = rsum+arr[i];
        }
        if(lsum==rsum){
            return true;
        }else return false;
    }






/*
1. Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

Test your code at : http://codingbat.com/prob/p189576
 */



    public int maxSpan(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while(nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if(span > max)
                max = span;
        }

        return max;
    }

}
