package com.code;
import java.util.*;

public class NinetyDegreeMatrixRotationInplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int size = scan.nextInt();
        int[][] matrix = new int[size][size];
        int[][] new_matrix = new int[size][size];
        System.out.println("Enter the matrix");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = scan.nextInt();
            }

        }
        int var = size -1;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                new_matrix[j][var] = matrix[i][j];
            }
            var--;
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(new_matrix[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
