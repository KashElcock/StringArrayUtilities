package com.zipcodewilmington;

import java.sql.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        List<String> stringArrayList = new ArrayList<String>(Arrays.asList(array));
        return stringArrayList.contains(value);
        //return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //Converting array into listToReverse using Arrays.asList
        List<String> listToReverse = Arrays.asList(array);
        //Using Collections Class's reverse method to reverse the list.
        Collections.reverse(listToReverse);
        //Converting back into array using toArray()
        return listToReverse.toArray(array);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        /**
         *
         * // this works great too.
         *
         * if(Arrays.equals(array,reverse(array))){
         * return true;
         * }
         * return false;
         *
         * }
         *
         *
         *
         *
         *
         * String[] rev = reverse(array);

         for (int i = 0; i < array.length; i++) {
         if (!array[i].equals(rev[rev.length-i-1]))
         {
         return false;
         }
         } return true; */


        //List<String>rev = Arrays.asList(array);
        //Collections.reverse(rev);

        //String rev = (reverse(array)).toString();
        //rev.equals(array.toString());

        //String[] rev = reverse(array);
        // Arrays.equals(array, rev);
        int check = 0;
        int see = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if ((reverse(array)[i] != array[array.length - 1 - i])) {
                check += 1;
                System.out.println("checked" + i);
            } else {
                see += 1;
                System.out.println("seen" + i);
            }

        }
        return (check < see);


        /**
         // *
         // * so, it's always true? Hashcode is the same, even reversed the identity is equal.
         //  if (array.equals(StringArrayUtils.reverse(array))){}

         // Let's compare the contents.
         // * passes all tests but doesn't check all the way.
         int i = 0;
         String [] reversed = StringArrayUtils.reverse(array);

         while (array[i] != reversed[reversed.length-1-i]){
         i = i++;
         System.out.println("Checked " + i + " & " + (reversed.length-1-i));
         return false;
         } return true;

         // * passes all tests but doesn't check all the way.
         //  **/
        // return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < abc.length(); i++){
            char a = abc.charAt(i);
            if (contains(array, String.valueOf(a))) {
                System.out.println("a");
                return false;
            }
            System.out.println("test" + i);
        } return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int nOO = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                nOO++;
            }
        }
        return nOO;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> retained = new ArrayList<String>(Arrays.asList(array));
        retained.remove(valueToRemove);
        String[] newString = retained.toArray(new String[0]);
        return newString;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> retained = new ArrayList<String>();
        retained.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if((array[i] != array[i - 1])) {
                retained.add(array[i]);
                System.out.println(retained);
            }
        }
        /**
         * //removes all duplicates
         * String[] newString = retained.toArray(new String[0]);
        return newString;
        List<String> retained = new ArrayList<String>();
        for(int i = 0; i < array.length; i++){
            if(!retained.contains(array[i])){
                retained.add(array[i]);
                System.out.println(retained);
            }
        }*/
        String[] newString = retained.toArray(new String[0]);
        return newString;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
