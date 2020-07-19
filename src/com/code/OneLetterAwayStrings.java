package com.code;

import java.util.*;

import static java.lang.Integer.min;
import static java.lang.Math.*;

public class OneLetterAwayStrings {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = sc.nextLine();
        System.out.println("Enter the second string");
        String secondString = sc.nextLine();
        int count = 0;
        int countone = 0;
        char[] firstStringArray = firstString.toCharArray();
        char[] secondStringArray = secondString.toCharArray();
        int j = 0;
        int max = firstStringArray.length;
        if(abs(firstStringArray.length - secondStringArray.length) > 1) {
            countone = abs(firstStringArray.length - secondStringArray.length);
            max = firstStringArray.length - 1;
        }

        int i = 0;
        while(i < max){
            if(j < min(firstStringArray.length ,secondStringArray.length) ) {
                if  (firstStringArray[i] != secondStringArray[j]) {
                    count++;
                    if(firstStringArray.length < secondStringArray.length && firstStringArray[i] == secondStringArray[j+1]){
                        j++;
                    }
                    else if (firstStringArray.length > secondStringArray.length && firstStringArray[i + 1] == secondStringArray[j]){
                        i++;
                    }
                    else if (firstStringArray.length == secondStringArray.length &&firstStringArray[i + 1] == secondStringArray[j+1]){
                        i++;
                        j++;
                    }
                    else{
                        flag = false;
                        break;
                    }

                }
                else {
                    i++;
                    j++;
                }


            }
            else
                break;

        }
        if(countone > 1 || count > 1){
            flag = false;
        }
        if(flag == true){
            System.out.println("Yes! One step away strings");
        }
        else
            System.out.println("No! Not one step away strings");
    }
}
