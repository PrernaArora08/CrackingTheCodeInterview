package com.code;

import java.util.*;

public class IsUniqueString  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        boolean uniqueness = true;
        boolean uniqueness_ws = true;
        uniqueness = Unique(input);
        uniqueness_ws = Unique_without_space(input);

        String result = new String();
        result = uniqueness==true ? "Unique": "Not Unique";

        System.out.println("using hashtable " + result);
        String result_ws = new String();
        result_ws = uniqueness_ws==true ? "Unique": "Not Unique";
        System.out.println("without space (bit vector) " +  result_ws);

    }

    private static boolean Unique(String input) {

        char[] char_array = input.toCharArray();

        Map<Character, Integer> count_array = new Hashtable<>();

        for (int i = 0; i < char_array.length; i++) {

            if (count_array.containsKey(char_array[i]) && char_array[i] != ' ')
                return false;
            else
                count_array.put(char_array[i], 1);
        }
        return true;
    }

    private static boolean Unique_without_space(String input) {

        int checker = 0;
        for (int i = 0; i < input.length(); ++i) {
            int val = (input.charAt(i) - 'a');

            // If bit corresponding to current character is already set
            if ((checker & (1 << val)) > 0)
                return false;

            // set bit in checker
            checker |= (1 << val);
        }

        return true;
    }

}
