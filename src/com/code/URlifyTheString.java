package com.code;

import java.util.*;

public class URlifyTheString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = new String();
        System.out.println("Enter the string to be URLified: ");
        input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);

        for(int i = 0; i <str.length() - 1 ; i++) {
            if (str.charAt(i) == ' ') {
                str.deleteCharAt(i);
                str.insert(i, "%20");
            }
        }
        System.out.println(str);
    }
}
