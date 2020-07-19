package com.code;

import java.util.*;

public class PalindromicStrings {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = sc.nextLine();
        System.out.println("Enter the second string");
        String secondString = sc.nextLine();
        if (firstString.length() == secondString.length()) {
            char[] firstStringArray = firstString.toCharArray();
            char[] secondStringArray = secondString.toCharArray();
            Map<Character, Integer> tally = new Hashtable<>();

            for (int i = 0; i < firstStringArray.length; i++) {
                if (tally.containsKey(firstStringArray[i]))
                    tally.replace(firstStringArray[i], tally.get(firstStringArray[i]) + 1);
                else
                    tally.put(firstStringArray[i], 1);
            }
            
            for (int i = 0; i < secondStringArray.length; i++) {
                if (tally.containsKey(secondStringArray[i])) {
                    tally.replace(secondStringArray[i], tally.get(secondStringArray[i]) - 1);
                }
            }
            for (int i = 0; i < firstStringArray.length; i++) {
                if (tally.get(firstStringArray[i]) != 0)
                    flag = false;
            }
        }
        else
             flag = false;

        if (flag == true)
            System.out.println("Yes, The strings are a permutation");
        else
            System.out.println("No, The strings are not a permutation");

        }

}
