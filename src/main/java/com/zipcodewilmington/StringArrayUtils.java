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
    public static String getLastElement(String[] array) {return array[array.length-1];}
    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {return array[array.length-2];}

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
        List<String>listToReverse = Arrays.asList(array);
        //Using Collections Class's reverse method to reverse the list.
        Collections.reverse(listToReverse);
        //Converting back into array using toArray()
        return  listToReverse.toArray(array);
    }
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        //List<String>rev = Arrays.asList(array);
        //Collections.reverse(rev);

        //String rev = (reverse(array)).toString();
        //rev.equals(array.toString());

        //String[] rev = reverse(array);
       // Arrays.equals(array, rev);
        int check = 0;
        int see = 0;

        for(int i = array.length-1; i >= 0; i--) {
            if ((reverse(array)[i] != array[array.length - 1 - i])) {
                check += 1;
                System.out.println("checked" + i);
            } else {
                see += 1;
                System.out.println("seen" + i);
            }

        }  return (check < see);




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
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

      /**  int count = 0;
        List<String> arrayList = new ArrayList(Arrays.asList(array));

        for(int i = 0; i <= array.length; i++){

            if (value == (arrayList.get(i))) {
                System.out.println(i);
                count += 1;
            }
            return count;
        } */
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
