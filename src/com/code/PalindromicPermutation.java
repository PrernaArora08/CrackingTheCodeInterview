package com.code;

import java.util.*;

public class PalindromicPermutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = new String();
        System.out.println("Enter the string");
        input = sc.nextLine();
        input = input.toLowerCase();
        int count = 0;
        boolean flag = true;
        Map<Character, Integer> count_map = new Hashtable<>();
        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (count_map.containsKey(input.charAt(i))) {
                    count_map.replace(input.charAt(i), count_map.get(input.charAt(i)) + 1);
                } else
                    count_map.put(input.charAt(i), 1);
            }
        }

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != ' ' && count_map.get(input.charAt(i)) % 2 != 0) {
                count++;
                count_map.replace(input.charAt(i), count_map.get(input.charAt(i)) - 1);
            }
        }
        if (count >= 2){
            System.out.println("NOT A PERMUTATION PALINDROME");
            flag = false;
        }
        if(flag == true){
            System.out.println("Hurray! You found a Permutation palindrome! " + input);
        }
    }
}
