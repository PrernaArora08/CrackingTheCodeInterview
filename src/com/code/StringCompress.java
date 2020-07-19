package com.code;

import java.util.*;

public class StringCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        char[] stringArray = input.toCharArray();
        ArrayList<Character> output = new ArrayList<Character>();

        int j = 1;
        int count = 1;
        int tally = 0;
        for (int i = 0; i < stringArray.length ; i = j){
            while(j < stringArray.length && stringArray[i] == stringArray[j]){
                count++;
                j++;
            }
            if( count == 1){
                tally++;
            }
            output.add(stringArray[i]);
            output.add((char) (count + '0'));
            count = 0;
        }
        if(tally == stringArray.length)
            System.out.println(stringArray);
        else
            System.out.println(output);

    }
}
