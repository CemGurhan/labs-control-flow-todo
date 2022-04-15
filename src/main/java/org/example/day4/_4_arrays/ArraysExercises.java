package org.example.day4._4_arrays;
import java.util.Arrays;


public class ArraysExercises {

    /*
        TODO 15

        firstLast0([0, 1, 2])   -> true
        firstLast0([0, 0, 0, 0] -> true
        firstLast0([5, 66, 0]   -> true
        firstLast0([7, 8])      -> false
        firstLast0([])          -> false
     */
    boolean firstLast0(int[] array) {

        if(array.length==0){

            return false;

        }else if(array[0]==0 || array[array.length-1]==0){

            return true;

        }



        return false;
    }

    /*
        TODO 16

        Arrays with 3 args only!

        middleInts([5, 26, 19], [1, 34, 22])        -> [26, 34]
        middleInts([11, 99, 5], [100, 20, 14]       -> [99, 20]
        middleInts([7, 7, 7], [44, 17, 56]          -> [7, 17]
     */
    int[] middleInts(int[] a, int[] b) {

        return new int[]{a[1],b[1]};
    }


    /*
       TODO 17

       Write a program that reverses an array of Strings
       reverse({"you", "are", "how", "hello"})  ->  {"hello", "how", "are", "you"}
       reverse({"", null, "me"})                ->  {"me", null, ""}
     */

    String[] reverse(String[] baseArray) {

        String reverse[]= new String[baseArray.length];

        for(int i=1;i<=baseArray.length;i++){

            reverse[baseArray.length-i]=baseArray[i-1];

        }

        return reverse;
    }

    /*

        TODO 18

        sum([3, 4, 8])    -> 15
        sum([12, 80])     -> 92
        sum([3, 3, 5, 5]) -> 16
        sum([4])          -> 4
        sum([])           -> 0
     */
    int sum(int[] nums) {

        int sum =0;

        if(nums.length==0){

            return 0;

        }
        for(int i=0;i<nums.length;i++){

            sum+=nums[i];

        }

        return sum;

    }

    /*
        TODO 19

        Given a non-empty array, return true if there is a place to split the array so that
        the sum of the numbers on one side is equal to the sum of the numbers on the other side

        isBalanced([1, 3, 2, 2])     -> true
        isBalanced([5, 5])           -> true
        isBalanced([8, 0, 2, -2, 8]  -> true
        isBalanced([30])             -> false
        isBalanced([2, 3, 4, 1, 2]]) -> false
     */
    boolean isBalanced(int[] array) {

        if (array.length>2){

            int rightCount=3;

            int leftCount=3;

            for(int i=0;i<array.length;i++){

                int sumFromLeft = array[i] + array[i+1];

                int sumFromRight= array[array.length-(i+1)] + array[array.length-(i+2)];

                if(sumFromLeft==sumFromRight){

                    return true;

                }
                else if (sumFromLeft!=sumFromRight){

                    while(sumFromLeft!=sumFromRight){

                        if(sumFromLeft>sumFromRight){

                            sumFromRight += array[array.length-(i+rightCount)];
                            rightCount++;

                        }
                        else if(sumFromRight>sumFromLeft){

                            sumFromLeft += array[leftCount-1];
                            leftCount++;

                        }
                        if(((rightCount-3)+(leftCount)==array.length)||((rightCount)+(leftCount-3)==array.length)){

                            return false;

                        }

                    }
                    return true;


                }
            }
        }else if(array.length==2){

            if(array[0]==array[1]){

                return true;

            }
        }

        return false;
    }

    /*
        TODO 20

        Return difference between max value and min value

        diff([10, 5, 8, 1, 4]) -> 9
        diff([5, 4, 6, 7])     -> 3
        diff([6, 6])           -> 0
        diff([-5, 3, 9])       ->14
     */
    int diff(int[] array) {

        int max=0;
        int min=array[0];

        for(int i=0;i<array.length;i++){

            if(array[i]>max){

                max=array[i];

            }
            if(array[i]<=min){

                min=array[i];

            }
        }

        return max-min;
    }

    /*
        TODO 21

        A group is at least two adjacent elements of the same value. Count the number of groups.

        countGroups([1, 2, 2, 3, 4, 4]) -> 2
        countGroups([3, 3, 6, 3, 3])    -> 2
        countGroups([5, 5, 5, 5, 5])    -> 1
        countGroups([])                 -> 0
        countGroups([5, 3, 6, 2, 4])    -> 0
     */
    int countGroups(int[] array) {
        int numElementsSameValue =0;

        for(int i=1;i<array.length;i++){

            if(array[i]==array[i-1]){

                numElementsSameValue+=1;

            }

        }
        if(numElementsSameValue==array.length-1){

            return 1;

        }
        return numElementsSameValue;
    }

    /*
        TODO 22

        innerInside([5, 6, 7, 4, 3, 3], [6, 4]) -> true
        innerInside([3, 3, 5, 5, 6, 6], [5, 3]) -> true
        innerInside([-1, 2, 3, 2], [3])         -> true
        innerInside([2, 5], [2, 5])             -> true
        innerInside([5, 4, 6, 32, 5], [4, 8])   -> false
        innerInside([], [5])                    -> false
     */
    boolean innerInside(int[] outer, int[] inner) {

        int innerEqualOuterCount=0;

        for(int i=0;i<outer.length;i++){

            for(int j=0;j<inner.length;j++){

                if(outer[i]==inner[j]){

                    innerEqualOuterCount++;


                }
            }
        }
        if(innerEqualOuterCount>=inner.length){

            return true;

        }

        return false;

    }
}