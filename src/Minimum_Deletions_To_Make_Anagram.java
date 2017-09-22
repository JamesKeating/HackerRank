/**
 * Created by siavj on 22/09/2017.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Minimum_Deletions_To_Make_Anagram {
    public static final int numberOfLetters = 26;
    public static final int charOffset = 97;

    public static int numberNeeded(String first, String second) {
        return getDelta(getCharFrequency(first), getCharFrequency(second));
    }

    public static int[] getCharFrequency(String str){
        int[] charFrequency = new int[numberOfLetters];

        for(char ch: str.toCharArray())
            charFrequency[(int)ch - charOffset]++;

        return charFrequency;
    }

    public static int getDelta(int[] arr1, int[] arr2){
        int count = 0;

        for(int i = 0;  i < numberOfLetters; i++)
            count += Math.abs(arr1[i] - arr2[i]);

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

// Alternative Solution
//public class Minimum_Deletions_To_Make_Anagram {
//
//
//    public static int numberNeeded(String first, String second) {
//        int num_of_deletions = 0;
//        HashMap<Character, Integer> count = new HashMap<>();
//
//        for (char ch: first.toCharArray()) {
//            if (count.containsKey(ch))
//                count.put(ch, count.get(ch) + 1);
//            else
//                count.put(ch,1);
//        }
//
//        for (char ch: second.toCharArray()){
//            if (count.containsKey(ch) && count.get(ch) > 0)
//                count.put(ch, count.get(ch) - 1);
//            else
//                num_of_deletions++;
//
//        }
//
//        num_of_deletions +=count.values().stream().mapToInt(Integer::intValue).sum();
//        return num_of_deletions;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
//        System.out.println(numberNeeded(a, b));
//    }
//}
